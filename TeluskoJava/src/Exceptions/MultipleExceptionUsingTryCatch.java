package Exceptions;

public class MultipleExceptionUsingTryCatch {

	public static void main(String[] args) {
		 int i = 5;
		 int j;
		 int nums[] = new int[4]	;
		 
		try { 
			j = i/0;	
		 }
		catch(ArithmeticException e) {
			System.out.println("cannot divide by 0");
		}
		try {
			System.out.println(nums[9]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter number less than 0 in nums[]");
		}
		catch(Exception e) { 			//here the exception is like parent class, it will handle every exception, must always be at last 
			
		}
		
	}

}
