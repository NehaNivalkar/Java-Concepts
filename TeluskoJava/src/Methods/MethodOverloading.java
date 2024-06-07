package Methods;
 	class addition{
 		
 		public int addNo(int num1,int num2) {
 			 return num1 + num2;
 		}
 		public int addNo(int num1,int num2,int num3) {
			return num1+num2+num3;
 			
 		}
 		
 	}
 	
public class MethodOverloading {

	public static void main(String[] args) {
		
		addition obj = new addition();
		int x = obj.addNo(2,4,5);
		System.out.println(x);
		
		
		

	}

}
