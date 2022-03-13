package junit5tutoring;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class J11GroupingTest {

	
	
//	@BeforeEach
//	void beforeEach(TestInfo info) {
//		System.out.println("Initialize the test data for "+ info.getDisplayName());
//		
//	}
//	
//	@AfterEach
//	void afterEach(TestInfo info) {
//		System.out.println("Cleaning  the test data for "+ info.getDisplayName());
//		
//	}
//	
//	@ParameterizedTest
//	@CsvSource(value= {"12,4,3","-12,3,-4","-12,-3,4","12,-4,-3"})
//	void multiply(int result, int x, int y) {
//		
//		assertEquals(result,Math.multiplyExact(x, y));
//		
//	}
//	
//	
//	@Nested
//	class OperationsWithZeroTest{
//		
//		@ParameterizedTest
//		@CsvSource(value= {"0,4,0","0,0,4","0,4,0","0,0,0"})
//		void multiply(int result, int x, int y) {
//			
//			assertEquals(result,Math.multiplyExact(x, y));
//			
//		}
//		
//	}
	
	//Test multiplyExact() method by non-zero integers and test multiplyExact() method by zero integers

    @ParameterizedTest
    @CsvSource(value= {"-12,-4,3","-12,4,-3", "12,3,4","12,-4,-3"})
    void multiplyTestWithNonZero(int result, int x, int y) {
		
		assertEquals(result,Math.multiplyExact(x, y));
		
	}
    
    @Nested
    class operationsWithZero{
    	
		@ParameterizedTest
		@CsvSource(value= {"0,4,0","0,0,4","0,4,0","0,0,0"})
		void multiplyTestWithZero(int result, int x, int y) {
			
			assertEquals(result,Math.multiplyExact(x, y));
			
		}
		
		@ParameterizedTest
		@CsvSource(value= {"4,4,0","4,0,4","4,4,0","0,0,0"})
		void addTestWithZero(int result, int x, int y) {
			
			assertEquals(result,Math.addExact(x, y));
			
		}
    	
    }

}
