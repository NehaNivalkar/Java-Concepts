package Exceptions;


public class ThrowKeyword {

	public static void main(String[] args) {
		int i=20;
		int j ;
		try{	
		j = 18/0;
		if (j==0)
			throw new ArithmeticException("I dont want to print 0");
			
		
		}
		catch(ArithmeticException e) {
			j = 18/1;
			System.out.println("Thats the default output");
			System.out.println(j);
			
		}
		
		

	}

}
