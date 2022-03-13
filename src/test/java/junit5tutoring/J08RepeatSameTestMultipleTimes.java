package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class J08RepeatSameTestMultipleTimes {

	
	//Test substring(), if it gives saame output when you use it 10 times
	@RepeatedTest(10)
	void subStringTest() {
		
		System.out.println("substring() is executed");
		assertEquals("Java", "Java OOP concept".subSequence(0, 4));
		
	}
	
	//Test exactAdd() in Java Math Class if it is working as excepted for first 10 pisitive inteegrs
	//1+2 /2+3/3+4
	static int x=1;
	static int y=2;
	static int result=3;
	@RepeatedTest(10)
	void adExactTest() {
		
		assertEquals(result, Math.addExact(x, y));
		System.out.println(result);
		x++;
		y++;
		result+=2;
	}
	
	@BeforeEach
	void beforeEachTest() {
		System.out.println("BEfore each test");
	}
	
	@AfterEach
	void afterEachTest() {		
		System.out.println("After each test");
		System.out.println("===========================");
	}
	
	
	@RepeatedTest(4)
	void containsTest() {		
		assertFalse("abcdefg".contains("ijk"));
		System.out.println("ContainsTest method is executed");
	}
	
	@RepeatedTest(5)
	void addTest() {	
		assertEquals(3, Math.addExact(1, 2));
		System.out.println("addTest test is executed");
	}

}
