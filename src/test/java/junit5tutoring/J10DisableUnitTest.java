package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class J10DisableUnitTest {

	   @Test
	   @Disabled 
	    void testWithArray() {
	        
	        
	        String str = "Unit test with JUnit5";
	        String actualArr[]= str.split(" ");
	        String expectedArr[] = {"Unit", "test", "with", "JUnit5"};
	        
	        //assertArrayEquals(actualArr, expectedArr);
	        
	        assertArrayEquals(actualArr, expectedArr, "Expected array does not match!");
	        
	       // assertTrue(Arrays.equals(actualArr, expectedArr));
	        
	      //  assertTrue(Arrays.equals(actualArr, expectedArr), "Expected array does not match!");
	        
	       // assertFalse(!Arrays.equals(actualArr, expectedArr));
	        
	    }
	  
	  
	  @Test
	    void setStringToArray() {
	        
	        
	        String str = "Unit test with JUnit5";
	        String actualArr[]= str.split(" ");
	        String expectedArr[] = {"Unit", "test", "with", "JUnit5"};
	        
	        assertArrayEquals(actualArr, expectedArr);
	        
	        assertArrayEquals(actualArr, expectedArr, "Expected array does not match!");
	        
	        assertTrue(Arrays.equals(actualArr, expectedArr));
	        
	        assertTrue(Arrays.equals(actualArr, expectedArr), "Expected array does not match!");
	        
	        assertFalse(!Arrays.equals(actualArr, expectedArr));
	        
	    }

}
