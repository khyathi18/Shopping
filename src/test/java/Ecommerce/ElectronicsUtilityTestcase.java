package Ecommerce;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ElectronicsUtilityTestcase {

	ElectronicsUtility e;
	static Scanner sc;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		sc=new Scanner(System.in);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		sc.close();
	}

	@Before
	public void setUp() throws Exception {
		
		e=new ElectronicsUtility();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIdTest() {
		//fail("Not yet implemented");
		assertEquals("8748jfkh",e.idTest());
	}

	@Test
	public void testCostTest() {
		//fail("Not yet implemented");
		assertEquals(10000,e.costTest(),"mismatch range");
	}

}
