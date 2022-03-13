package junit5tutoring;

import static org.junit.Assert.assertThrows;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.function.ThrowingRunnable;
import org.junit.jupiter.api.Test;

class J05TestExceptions {

	@Test
	void testException01() {
		
		String str= null;
		
		/*
		  
		  1)The exception class which you put in excepted part should be able to catch the excpetion
		  which is thrown. It can be same exception with the thrown or can be parent exception
		  for the thrown exception
		  
		  2)If the method under test does not throw exception asserThrow() fails the test
		    If the exception cannot be caught for any reason, asserThrows() fails the test
		 */
		assertThrows(NullPointerException.class, ()->{str.length();});
        
//		assertThrows(NullPointerException.class
//				              , ()->{
//				            	      System.out.println("testException01 is executed");
//				            	      str.length();
//				            	  
//				                     }
//				              );
	}
	
	@Test
	void testException() {
		
		String str="abc";
		
		assertThrows(NumberFormatException.class, 
				                             ()->{
			                                            
				                            	 Integer.parseInt(str);
			                                           });
	}
	
	

/*/
	  Integer.parseInt("Ali Can"); thorows NumberFormat Exception
	  Create test methos
	 */
	@Test
	void testException02() {
		
		String str="Ali Can";
	//	String str="123"; if you use this parseInt will convert this to int so ithere will be noe xcpetion so the test fail
		
		assertThrows(NumberFormatException.class,
				                        ()->{
				                        	 System.out.println("testException02 is executed");
				                        		Integer.parseInt(str);
				                        });
		
	
		
	}
	
	static int s=0;
	
	@Test
	void testIndex() {
		
		//List<Integer>list1= new ArrayList<>();
		
		
//		list1.add(2);
//		list1.add(2);
		
		int [] arr= {1,2,3};
		//System.out.println(list1.get(1));
		//assertThrows(IndexOutOfBoundsException.class, ()->list1.get(3));
		
		assertThrows(ArrayIndexOutOfBoundsException.class, ()-> arr(arr));
		
	}
	
	int arr(int arr[]) {
		
		return arr[4];
		
		
		
	}

	/*/
	 * Dividing by 0 throws ArtihemticExcetion
	 * Create test
	 */
	@Test
	void testException03() {
		
		int num=123;
		int num2=0;
		
		assertThrows(ArithmeticException.class,
				                          ()->divide(num,num2)
				                          );
	}
		int divide(int a, int b) {
			return a/b;
		}
		
		
		
		/*/
		 * NEgative values for ages should throw IllegalArhumentException
		 * Create test method
		 */
		
		
		
		@Test
		void testException04() {
			int age=-12;
			assertThrows(IllegalArgumentException.class, ()-> checkAge(age));
			
		}
		
		private void checkAge(int age) {
			if(age<0) {
				throw new IllegalArgumentException();
			}else {
				System.out.println(age);
			}
		}
	}



