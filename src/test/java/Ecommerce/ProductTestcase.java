package Ecommerce;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProductTestcase {
	static ProductUtility p;
	static Scanner scanner;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		scanner=new Scanner(System.in);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		scanner.close();
	}

	@Before
	public void setUp() throws Exception {
		p=new ProductUtility();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMul() {
		//fail("Not yet implemented");
		int res=p.mul(3, 4);
		assertEquals(12,res);
	}

	@Test
	public void testSum() {
		int res=p.sum(20,12);
		assertEquals(32,res);
	}

	@Test
	public void testDifference() {
		int res=p.difference(30, 44);
		assertEquals(-14,res);
	}

	@Test
	public void testQuotient() {
		int res=p.quotient(13, 4);
		assertEquals(3,res);
	}

	@Test
	public void testReminder() {
		int res=p.reminder(13, 4);
		assertEquals(1,res);
	}

}
