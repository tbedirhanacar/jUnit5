package junit5tutoring;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class J07ParameterizedTest {

	//Create a test method to test if the length() working as excepted for
	//ABCD,ABC,A,"", abcdefg
	@Test //not recommended
	void testLength1() {
		
		assertTrue("ABCD".length()>0);
		assertTrue("ABC".length()>0);
		assertTrue("A".length()>0);
		assertTrue("".length()>=0);
		assertTrue("abcdefg".length()>0);
		
		
		
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"ABCD","ABC","A","","abcdefg"})
	@DisplayName("This test is used to work with more than one parameter")
	void testLength2(String str) {
		assertTrue(str.length()>=0);
		
	}
	
	
	
	@Test
	void upperCaseTest1() {
		String str1="All Can";
		String str2="all can";
		String str3="all";
		String str4="123";
	    String str5="A";
		String str6="";
		
		assertEquals("ALL CAN", str1.toUpperCase());
		assertEquals("ALL CAN", str2.toUpperCase());
		assertEquals("ALL", str3.toUpperCase());
		assertEquals("123", str4.toUpperCase());
		assertEquals("A", str5.toUpperCase());
		assertEquals("", str6.toUpperCase());
	}
		@ParameterizedTest
		@CsvSource(value= {"ALİ CAN, Ali Can","ALİ CAN, ali can","ALİ, ali", "123,123","A,A","\"\",\"\""})
		void upperCaseTest2(String s1, String s2) {
			 assertEquals(s1,s2.toUpperCase());
			
		}
	

   //Check if a string is contaning "a" or not
   //Use "ali"-"joe"-"tom"
   //Use @CvsSource annotation


    @ParameterizedTest
    @CsvSource(value= {"true, ali, a","true, joe, o","false, tom, a"})
    void containsTest(Boolean b1, String s1, String s2)
    {
    	assertEquals(b1,s1.contains(s2));
    }
    
    @ParameterizedTest
    @CsvSource(value= {"5, 1, 4","5, 2, 3","6, 2, 4"})
    void containsTestD(int result, int n1, int n2)
    {
    	assertEquals(result, n1+n2);
    }
    
    
    
}
