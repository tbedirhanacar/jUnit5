package junit5tutoring;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class J09PerformanceTest {

	//We can test the performance of the application
	//Run time performance or load times and stress can be tested
		
    //Create a method to Print positive integers from 1 to 1000000 on the console
	//Test if this task can be completed in 3 seconds
		
	@Test
	@Disabled//for not to run specific test
	void testPrintPerformance1() {
		
		assertTimeout(Duration.ofSeconds(3), ()->IntStream.rangeClosed(1,1000000).forEach(System.out::println));
		
	}
	
	@Test
	void testPerforman() {
		assertTimeout(Duration.ofSeconds(1), ()-> IntStream.rangeClosed(2, 100).forEach(System.out::println));
	}
	
	
	@Test
	@Disabled //for not to run specific test
	void testPrintPerformance2() {
		
		assertTimeout(Duration.ofSeconds(10), ()->IntStream.rangeClosed(1,1000).reduce((x,y)->Math.addExact(x,y)));
		
	}
	

}
