package Arrays;

//CREATING A MULTIDIMENTIONAL ARRAY

public class MultiDimentionalArray {

	public static void main(String[] args) {
		int[][] array = new int[3][4];
		
		for (int i =0; i<3; i++) {
			for (int j =0; j<4; j++){
				
				System.out.print(array[i][j] + " ");
			}
			
			System.out.println(" ");
		}
		
		
		
	}}