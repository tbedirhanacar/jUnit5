package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class J04BeforeAll_AfterAll {

//BeforeAll and AfterAll method must be static to run
	//In JUnit4 we were using @BEforeClass and @AfterClass instead of @AFterAll and @BEforeAll
	//in JUnit4 we were using @Before and @AFter instead of @BeforeEach and @AfterEach
    
    @BeforeAll
    static void beforeAll() {
        
        System.out.println("Create a connection with database");
        
    }
    
    @AfterAll
    static void afterAll() {
        System.out.println("Close the connection with database");
    }
    
    
    
    @Test
    void testWithArray() {
        
        
        String str = "Unit test with JUnit5";
        String actualArr[]= str.split(" ");
        String expectedArr[] = {"Unit", "test", "with", "JUnit5"};
        
        assertArrayEquals(actualArr, expectedArr);
        
        assertArrayEquals(actualArr, expectedArr, "Expected array does not match!");
        
        assertTrue(Arrays.equals(actualArr, expectedArr));
        
        assertTrue(Arrays.equals(actualArr, expectedArr), "Expected array does not match!");
        
        assertFalse(!Arrays.equals(actualArr, expectedArr));
        
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
