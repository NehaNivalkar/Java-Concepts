package BasicPrograms;

class Cars{
	String name;
	int ModelYear;
	int priceInCr;
}

public class arrayofcars {

	public static void main(String[] args) {
		Cars S1 = new Cars();
		S1.name = "Mustang";
		S1.ModelYear = 1998;
		S1.priceInCr = 2;
		
		Cars S2 = new Cars();
		S2.name = "BMW";
		S2.ModelYear = 1988;
		S2.priceInCr = 3;
		
		Cars S3 = new Cars();
		S3.name = "Volvo";
		S3.ModelYear = 1982;
		S3.priceInCr = 12;
		
		
		Cars cars[] = new Cars[3];	
		cars[0] = S1;
		cars[1]	= S2;	
		cars[2] = S3;
		
		for(int i=0; i<cars.length;i++) {
			System.out.println(" name: "+ cars[i].name  + "\n year: " + cars[i].ModelYear +  "\n price: " + cars[i].priceInCr);
			System.out.println();
		}
		
		
	}

}
