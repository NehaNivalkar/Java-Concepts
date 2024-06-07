package Exceptions;

public class FinallyKeyword {

	public static void main(String[] args) {
		int i = 0;
		 int j;
		 
		 try {
			 j = 18/i;
		 }
		 
		 catch(Exception e) {
			 System.out.println("Can't divide by 0");
		 }
		 
		 finally {		// finally will execute , regardless of any result
			 System.out.println("Try catch Block executed");
		 }

	}

}
