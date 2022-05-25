package Ecommerce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ElectronicsUtilityTest {

	ElectronicsUtility e=new ElectronicsUtility();
	@Test
	void testIdTest() {
		//fail("Not yet implemented");
		assertEquals("8748jfkh",e.idTest());
	}

	@Test
	void testCostTest() {
		//fail("Not yet implemented");
		assertEquals(10000,e.costTest(),"mismatch range");
	}

}
