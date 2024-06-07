package Loops;

public class whileLoop {

	public static void main(String[] args) {
		int i = 1;
		while(i<=5)
		{
			System.out.println("Hardik " + i );
			int j = 1;											  //
			while(j<=2) {                                         // NESTED WHILE LOOP
				System.out.println("Naik " + j);                  //
				j++;                                              //
			}
			i++;
		}
			
			
		}

	}

