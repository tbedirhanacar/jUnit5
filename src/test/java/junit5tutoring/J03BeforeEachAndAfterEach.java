package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class J03BeforeEachAndAfterEach {

	@Test
	void test(TestInfo info) {
		System.out.println(info.getDisplayName()+" method is running here");
	}
	
	@BeforeEach
	void beforeEach(TestInfo info) {
		
	System.out.println(info.getDisplayName()+"method runs here!!");	
	}
	
	@AfterEach
	void AfterEach() {
		System.out.println("After Each method runs here!!");
	}
	
	@Test
	void testWithArray() {
		
		System.out.println("Test with Arraymethod is running here");
		
		String str="Unit test with JUnit5";
		String actualArr[]=str.split(" ");
		String exceptedArr[]= {"Unit","test","with", "JUnit5"};
		
		assertArrayEquals(actualArr, exceptedArr);
		
		assertArrayEquals(actualArr, exceptedArr,"Excepted array does not match");
		
		assertTrue(Arrays.equals(actualArr, exceptedArr));
		assertTrue(Arrays.equals(actualArr, exceptedArr),"Excepted array does not match");
		
		assertFalse(!Arrays.equals(actualArr, exceptedArr));
		
		
	
	}

}
