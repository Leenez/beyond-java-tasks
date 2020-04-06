package junit_tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import task_2.*;

public class Task2Tests {
	
	private NumberHandler nh;
	
	@Before
	public void init() {
		nh = new NumberHandler();
	}
	
	@Test
	public void testChangeInOrder() {
		Integer[] testArray1 = new Integer[] { 0,6,9,100,111 };
		Integer[] testArray2 = new Integer[] { 100,9,6,0,111 };
		Integer[] testArray3 = new Integer[] { 111,100,9,6,0 };
				
		assertEquals(2, nh.getSmallestAmount(testArray1));
		assertEquals(2, nh.getSmallestAmount(testArray2));
		assertEquals(2, nh.getSmallestAmount(testArray3));
	}
	
	@Test
	public void testDuplicateNumbers() {
		Integer[] testArray1 = new Integer[] { 0,0,6,100,103,103,0,6,6 };
		Integer[] testArray2 = new Integer[] { 1,1,2,2,0,1,0,0,0 };
		assertEquals(2, nh.getSmallestAmount(testArray1));
		assertEquals(0, nh.getSmallestAmount(testArray2));
	}
	
	@Test
	public void testDuplicateSubstraction() {
		Integer[] testArray1 = new Integer[] { 1,4,7,10 };
		Integer[] testArray2 = new Integer[] { 0,5,10,15 };
		assertEquals(2, nh.getSmallestAmount(testArray1));
		assertEquals(4, nh.getSmallestAmount(testArray2));
	}
	
	@Test
	public void testCombinedTests() {
		Integer[] testArray1 = new Integer[] { 0,0,2,4,2,4,6,6,6 };
		Integer[] testArray2 = new Integer[] { 6,6,6,4,2,4,2,0,0 };
		assertEquals(1, nh.getSmallestAmount(testArray1));
		assertEquals(1, nh.getSmallestAmount(testArray2));
	}

}
