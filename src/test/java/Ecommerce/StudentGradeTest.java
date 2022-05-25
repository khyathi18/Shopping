package Ecommerce;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentGradeTest {

	StudentUtility s;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		s=new StudentUtility();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMarksTest() {
		//fail("Not yet implemented");
		assertEquals(8.5f,s.marksTest());
	}

	@Test
	public void checkMarksTest()
	{
		assertEquals(2.5f,s.checkInternalMarks()," no negative marks");
		assertEquals(6.0f,s.checkExternalMarks()," no negative marks");
	}
}
