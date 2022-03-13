package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class J02Assertion {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testToFindMin(){
		int actualMin= Math.min(3, 14);
		int exceptedMin=3;
		
		assertEquals(exceptedMin, actualMin);
		assertEquals(exceptedMin, actualMin,"The excepted data does not match");
		
		assertTrue(exceptedMin==actualMin);
		assertTrue(exceptedMin==actualMin,"The excepted data does not match");
		
		assertFalse(exceptedMin!=actualMin);
		assertFalse(exceptedMin!=actualMin,"The excepted data should not match");
		
		
		
	}
	
	@Test
	void testWithArray() {
		
		String str="Unit test with JUnit5";
		String actualArr[]=str.split(" ");
		String exceptedArr[]= {"Unit","test","with", "JUnit5"};
		
		assertArrayEquals(actualArr, exceptedArr);
		
		assertArrayEquals(actualArr, exceptedArr,"Excepted array does not match");
		
		assertTrue(Arrays.equals(actualArr, exceptedArr));
		
		
	
	}
	
	@Test
	void testWithArrayD() {
		
		String str="Unit test with JUnit5";
		String actualArr[]=str.split(" ");
		String exceptedArr[]= {"Unit","test","with", "JUnit5"};
		
		assertArrayEquals(exceptedArr, actualArr, "Excepted array does not match");
		
		assertTrue(Arrays.equals(exceptedArr,actualArr));
		
		
	}

}
