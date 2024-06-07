package Exceptions;

public class TryCatch {

	public static void main(String[] args) {
		int i = 4 ;
		int j = 0;
			
		try{j = i/2; // replace 2 by 0 to execute try catch
		}
		catch(Exception e) {
			System.out.println("Invalid");
		}
		System.out.println(j);
		System.out.println("Bye");

	}

}
