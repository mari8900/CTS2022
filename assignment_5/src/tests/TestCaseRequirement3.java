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

public class TestCaseRequirement3 {
	
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
	public void testGetPercentOfBadWeeksRight() {
		
		int minLimit = 10;
		ArrayList<Integer> productsSoldByWeeks = new ArrayList<>();
		productsSoldByWeeks.add(9);
		productsSoldByWeeks.add(7);
		productsSoldByWeeks.add(5);
		productsSoldByWeeks.add(3);
		productsSoldByWeeks.add(4);
		productsSoldByWeeks.add(25);
		productsSoldByWeeks.add(35);
		productsSoldByWeeks.add(45);
		productsSoldByWeeks.add(45);
		productsSoldByWeeks.add(45);
		
		Product product = new Product(NAME, PRICE, productsSoldByWeeks);
		
		int percentageOfBadWeeks = product.getPercentOfBadWeeks(minLimit);
		int expectedPercentage = (int)50.0f;
		assertEquals(percentageOfBadWeeks, expectedPercentage);
	}
	
	@Test
	public void testGetWeeksIndexWithMaxSalesRight() {
		
		ArrayList<Integer> productsSoldByWeeks = new ArrayList<>();
		productsSoldByWeeks.add(90);
		productsSoldByWeeks.add(85);
		productsSoldByWeeks.add(76);
		productsSoldByWeeks.add(33);
		productsSoldByWeeks.add(90);
		productsSoldByWeeks.add(90);
		
		Product product = new Product(NAME, PRICE, productsSoldByWeeks);
		
		ArrayList<Integer> maxWeeks = product.getWeeksIndexWithMaxSales();
		ArrayList<Integer> expectedIndexes = new ArrayList<>();
		expectedIndexes.add(0);
		expectedIndexes.add(4);
		expectedIndexes.add(5);
		assertEquals(maxWeeks, expectedIndexes);
	}
}
