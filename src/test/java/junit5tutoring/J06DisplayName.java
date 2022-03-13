package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class J06DisplayName {

	@Test
	@DisplayName("Test parseInt() to check if it is throwing NullPointerException for nondigit characters")
	void testException() {
		
		String str="Ali Can";
	//	String str="123"; if you use this parseInt will convert this to int so ithere will be noe xcpetion so the test fail
		
		assertThrows(NumberFormatException.class,
				                        ()->{
				                        	 System.out.println("testException02 is executed");
				                        		Integer.parseInt(str);
				                        });
		
	
		
	}
	

}
