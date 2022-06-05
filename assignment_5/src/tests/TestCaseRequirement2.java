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
import exceptions.NoValuesForArray;
import exceptions.SameLengthArrayAndMaxProductsException;


public class TestCaseRequirement2 {
	
	public static final String NAME = "USB";
	public static final float PRICE = 69.55f;
	public static final ArrayList<Integer> WEEKLY_SOLD_ITEMS = new ArrayList<>();
	public static final int MIN_QUANTITY_PRODUCTS_SOLD = 0;
	public static final int MAX_QUANTITY_PRODUCTS_SOLD = 1000;
	Product product;
	
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
		product = new Product(NAME, PRICE, WEEKLY_SOLD_ITEMS);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testAddWeekRight() {
		
		int weekToAdd = product.getSoldItems(1) + 1;
		ArrayList<Integer> productsSoldByWeeks = new ArrayList<>();
		productsSoldByWeeks.add(10);
		productsSoldByWeeks.add(20);
		productsSoldByWeeks.add(30);
		product.setSales(productsSoldByWeeks);
		product.addWeek(weekToAdd);
		assertEquals(weekToAdd, product.getSoldItems(productsSoldByWeeks.size() - 1));
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
	public void testAddWeekErrorCondition() {
		
		int numberOfProductsSoldInvalid = -1;
		product.addWeek(numberOfProductsSoldInvalid);
	}
	
	@Test(expected = NoValuesForArray.class)
	public void testGetSoldItemsExistenceNullReference() {
		
		ArrayList<Integer> productsSold = null;
		product.setSales(productsSold);
		product.getSoldItems(productsSold.size() - 1);
	}
	
	@Test(expected = InvalidInputValueForWeek.class)
	public void testAddWeekRangeMaxValue() {
		
		int productsSoldNewWeek = Integer.MAX_VALUE;
		product.addWeek(productsSoldNewWeek);
	}
	
	@Ignore
	@Test(expected = NoValuesForArray.class)
	public void testGetSoldItemsRange0() {
		
		ArrayList<Integer> newArray = new ArrayList<>();
		product.setSales(newArray);
	}
	
	@Ignore
	@Test(expected = SameLengthArrayAndMaxProductsException.class)
	public void testGetNoWeeksAboveLimitRangeMaxValue() {
		
		ArrayList<Integer> productsSold = new ArrayList<>();
		productsSold.add(9);
		productsSold.add(7);
		productsSold.add(5);
		productsSold.add(10);
		productsSold.add(15);
		productsSold.add(25);
		productsSold.add(35);
		productsSold.add(45);
		int maxWeeks = productsSold.size();
		int minLimit = 10;
		product.setSales(productsSold);
		
		assertNotEquals(maxWeeks, product.getNoWeeksAboveLimit(minLimit));
	}
	
	@Test
	public void testAddWeekLowerBoundary() {
		
		int productsSoldThisWeek = MIN_QUANTITY_PRODUCTS_SOLD;
		product.addWeek(productsSoldThisWeek);
		assertEquals(productsSoldThisWeek, product.getSoldItems(3));
	}
	
	@Test
	public void testAddWeekUpperBoundary() {
		
		int productsSoldThisWeek = MAX_QUANTITY_PRODUCTS_SOLD;
		product.addWeek(productsSoldThisWeek);
		assertEquals(productsSoldThisWeek, product.getSoldItems(3));
	}
	
	@Ignore
	@Test
	public void testGetSoldItemsLowerBoundary() {
		
	}
	
	@Ignore
	@Test
	public void testGetSoldItemsUpperBoundary() {
		
		int maxSizeArray = Integer.MAX_VALUE;
		ArrayList<Integer> soldProducts = new ArrayList<>(maxSizeArray);
		product.setSales(soldProducts);
	}
	
	@Test
	public void testGetNoWeeksAboveLimitLowerBoundary() {
		
		int minLimit = 30;
		int minNoOfProducts = 0;
		int expectedNoOfProducts = product.getNoWeeksAboveLimit(minLimit);
		assertEquals(expectedNoOfProducts, minNoOfProducts);
	}
	
	@Test
	public void testGetNoWeeksAboveLimitUpperBoundary() {
		
		int minLimit = 9;
		int maxNoOfProducts = WEEKLY_SOLD_ITEMS.size();
		int expectedNoOfProducts = product.getNoWeeksAboveLimit(minLimit);
		assertEquals(expectedNoOfProducts, maxNoOfProducts);
	}
	
	@Ignore
	@Test(expected = NoValuesForArray.class)
	public void testGetNoWeeksAboveLimitCardinalityZero() {
		
		ArrayList<Integer> sales = new ArrayList<>();
		product.setSales(sales);
		product.getNoWeeksAboveLimit(MIN_QUANTITY_PRODUCTS_SOLD);
	}
	
	@Test
	public void testGetNoWeeksAboveLimitCardinalityOne() {
		ArrayList<Integer> sales = new ArrayList<>();
		sales.add(10);
		product.setSales(sales);
		
		int expectedQuantityOfProductSold = 10;
		int actualQuantityOfProductSold = product.getSoldItems(0);
		
		assertEquals(expectedQuantityOfProductSold, actualQuantityOfProductSold);
	}

	@Test
	public void testGetMinGradeOrderingAscending() {
		ArrayList<Integer> sales = new ArrayList<>();
		for(int quantity = 5; quantity <= 15; quantity++) {
			sales.add(quantity);
		}
		product.setSales(sales);
		
		int expectedMinQuantity = 5;
		int actualMinQuantity = product.getSoldItems(0);
		
		assertEquals(expectedMinQuantity, actualMinQuantity);
	}
	
	@Test
	public void testGetMinGradeOrderingDescending() {
		ArrayList<Integer> sales = new ArrayList<>();
		for(int quantity = 15; quantity >= 5; quantity--) {
			sales.add(quantity);
		}
		product.setSales(sales);
		
		int expectedMaxQuantity = 15;
		int actualMaxQuantity = product.getSoldItems(0);
		
		assertEquals(expectedMaxQuantity, actualMaxQuantity);
	}

}
