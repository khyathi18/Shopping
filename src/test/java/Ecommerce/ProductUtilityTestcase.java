package Ecommerce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductUtilityTestcase {

	ProductUtility p=new ProductUtility();
	@Test
	void testIdTest() {
		
	}
	@Test
	void testMul() {
		//fail("Not yet implemented");
		int res=p.mul(3, 4);
		assertEquals(12,res);
	}
	@Test
	void testSum() {
		int res=p.sum(20,12);
		assertEquals(32,res);
	}
	@Test
	void testDifference() {
		int res=p.difference(30, 44);
		assertEquals(-14,res);
	}
	@Test
	void testQuotient() {
		int res=p.quotient(13, 4);
		assertEquals(3,res);
	}
	@Test
	void testRemainder() {
		int res=p.reminder(13, 4);
		assertEquals(1,res);
	}
}
