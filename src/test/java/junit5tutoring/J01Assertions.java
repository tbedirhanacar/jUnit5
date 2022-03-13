package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class J01Assertions {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testToLength() {  //the access modifier is not impoartant in here not like Junit4
		
		
		int actualLength="abcd".length();
		
		int exceptedLength=4;
		
		//Assertions
		//1. assertEquals();
		//2. assertTrue();
		//3.assertFalse();
		
	
		
		//a)
		//assertEquals(exceptedLength, actualLength);
		
		//b)
		//assertEquals(exceptedLength, actualLength, "The excepted data not matched");
		
		//a)
		//assertTrue(exceptedLength==actualLength);
		
		//b)
		//assertTrue(exceptedLength==actualLength,"The excepted data not matched");
		
		//3.assertFalse();
		
		//a) 
		//assertFalse(exceptedLength!=actualLength);
		//b)
		//assertFalse(exceptedLength==actualLength,"The excepted data should not matched");
		
	}
	
	@Test
	void testToConvertUpper() {
		
		String actualString= "abcd".toUpperCase(); //ABCD
		String exceptedString="ABCD";
		String str=null;
	
		
		//a)
		assertEquals(exceptedString, actualString);
		//b))
		assertEquals(exceptedString, actualString, " The excepted data not matched");
		
		//a)
	assertTrue(exceptedString.equals(exceptedString));
		//b)
	assertTrue(exceptedString.equals(exceptedString),"The excepted data not matched");
		
		
		//a)
	   assertFalse(!exceptedString.equals(exceptedString));
		//b)
	  assertFalse(!exceptedString.equals(exceptedString),"The excepted data should not matched");
		
	
	  assertNull(str);
	  
	  assertNotNull(exceptedString,"should not return null");
		
	}
	
	@Test
	void testToContain() {
		
		boolean actualContain="abcd".contains("fa");
		boolean exceptedContain=false;
		
		assertEquals(exceptedContain, actualContain);
		assertEquals(exceptedContain, actualContain,"The actual data does not contain the excepted data");
		
		
		assertTrue(exceptedContain == actualContain);
		assertTrue(exceptedContain == actualContain,"The actual data does not contain the excepted data");
	
		assertFalse(exceptedContain != actualContain);
		assertFalse(exceptedContain != actualContain,"The actual data does not contain the excepted data");
	}
	
	@Test
	void testToCheck() {
		
		int num1=5;
		int num2=4;
		
		assertTrue(num1>num2);
	}

}
