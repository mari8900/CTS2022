package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import classes.Product;
import exceptions.InvalidInputValueForWeek;

public class TestCaseRequirement2 {
	
	public static final String NAME = "USB";
	public static final float PRICE = 69.55f;
	public static final ArrayList<Integer> WEEKLY_SOLD_ITEMS = new ArrayList<>();
	Product productWithNameAndPrice;
	Product productWithAllParameters;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		WEEKLY_SOLD_ITEMS.add(19); 
		WEEKLY_SOLD_ITEMS.add(10);
		WEEKLY_SOLD_ITEMS.add(27);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		productWithNameAndPrice = new Product(NAME, PRICE);
		productWithAllParameters = new Product(NAME, PRICE, WEEKLY_SOLD_ITEMS);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddWeekRight() {
		
		int weekToAdd = productWithAllParameters.getSoldItems(1) + 1;
		ArrayList<Integer> productsSoldByWeeks = new ArrayList<>();
		productsSoldByWeeks.add(10);
		productsSoldByWeeks.add(20);
		productsSoldByWeeks.add(30);
		productWithAllParameters.setSales(productsSoldByWeeks);
		productWithAllParameters.addWeek(weekToAdd);
		assertEquals(weekToAdd, productWithAllParameters.getSoldItems(productsSoldByWeeks.size() - 1));
	}
	
	@Test
	public void testGetSoldItemsRight() {
		
		ArrayList<Integer> productsSoldByWeeks = new ArrayList<>();
		productsSoldByWeeks.add(10);
		productsSoldByWeeks.add(20);
		productsSoldByWeeks.add(30);
		
		Product product = new Product(NAME, PRICE, productsSoldByWeeks);
		int numberOfSoldProducts = product.getSoldItems(0);
		assertEquals(numberOfSoldProducts, productsSoldByWeeks.get(0), 0);
	}
	
	@Test
	public void testGetNoWeeksAboveLimitRight() {
		
		int minLimit = 10;
		ArrayList<Integer> productsSoldByWeeks = new ArrayList<>();
		productsSoldByWeeks.add(9);
		productsSoldByWeeks.add(7);
		productsSoldByWeeks.add(5);
		productsSoldByWeeks.add(10);
		productsSoldByWeeks.add(15);
		productsSoldByWeeks.add(25);
		productsSoldByWeeks.add(35);
		productsSoldByWeeks.add(45);
		Product product = new Product(NAME, PRICE, productsSoldByWeeks);
		
		int numberOfWeeks = product.getNoWeeksAboveLimit(minLimit);
		int expectedNumber = 4;
		assertEquals(numberOfWeeks, expectedNumber);
	}
	
	@Test(expected = InvalidInputValueForWeek.class)
	public void testAddSoldProductsOfWeekErrorCondition() {
		
		int numberOfProductsSoldInvalid = -1;
		productWithAllParameters.addWeek(numberOfProductsSoldInvalid);
	}
}
