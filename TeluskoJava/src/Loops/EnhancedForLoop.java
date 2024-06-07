package Loops;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[6];      //here int[6] we declare the size of array.
		
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		
		for (int n: array) {
			System.out.println(n);
		}

	}

}
