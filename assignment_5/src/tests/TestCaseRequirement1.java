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
import exceptions.NoValuesForArray;



//at least 2 Error Condition tests for each constructor

//1 Reference test for the constructor that receives the ArrayList

//1 Reference test for setSales()


public class TestCaseRequirement1 {
	
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
	
	@Test
	public void testConstructorWithNameAndPriceRightInitializareAtribute() {
		
		String name = "USB";
		float price = 69.55f;
		
		Product product = new Product(name, price);
		assertEquals("Name is not initialized correctly", name, product.getName());
		assertEquals("Price is not initialized correctly", price, product.getPrice(), 0);
	}
	
	@Test
	public void testConstructorWithAllParametersRightInitializareAtribute() {
		
		String name = "USB";
		float price = 69.55f;
		ArrayList<Integer> weeklySoldItems = new ArrayList<>();
		weeklySoldItems.add(19); 
		weeklySoldItems.add(10);
		weeklySoldItems.add(27);
		
		Product product = new Product(name, price, weeklySoldItems);
		assertEquals("Name is not initialized correctly", name, product.getName());
		assertEquals("Price is not initialized correctly", price, product.getPrice(), 0);
		for(int i = 0; i < weeklySoldItems.size(); i++) {
			assertEquals("Weekly sold value is not initialized correctly", (int)weeklySoldItems.get(i), product.getSoldItems(i));
		}
	}
	
	@Test
	public void testConstructorWithNameAndPriceCreareObiect() {
		
		try {
			Product product = new Product(NAME, PRICE);
			assertNotNull(product);
		} catch(Exception e) {
			fail("The constructor with name and price has thrown an exception for correct values");
		}
	}
	
	@Test
	public void testConstructorWithAllParametersCreareObiect() {
		
		try {
			Product product = new Product(NAME, PRICE, WEEKLY_SOLD_ITEMS);
			assertNotNull(product);
		} catch(Exception e) {
			fail("The constructor with all parameters has thrown an exception for correct values");
		}
	}
	
	@Test(expected = NoValuesForArray.class)
	public void testConstructorExistenceNullReference() {
		
		ArrayList<Integer> arrayInvalid = null;
		Product product = new Product(NAME, PRICE, arrayInvalid);
		product.getWeeksIndexWithMaxSales();
	}
	
	@Test(expected = NoValuesForArray.class)
	public void testSetSalesExistenceNullReference() {
		
		ArrayList<Integer> arrayInvalid = null;
		productWithAllParameters.setSales(arrayInvalid);
		productWithAllParameters.getWeeksIndexWithMaxSales();
	}
}
