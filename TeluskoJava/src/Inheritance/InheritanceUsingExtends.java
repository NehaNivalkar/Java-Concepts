package Inheritance;

class Calc{
	
	public int add(int a , int b) {
		return a+b;
	}
	
	public int sub(int a , int b) {
		return a-b;
	}
}

 class AdvCalc extends Calc{
	 
	 public int multi(int a , int b) {
			return a*b;
	}
	 public int div(int a , int b) {
			return a/b;
 }
public class InheritanceUsingExtends {
		public static void main(String[] args) {
			
		
	AdvCalc obj = new AdvCalc();
	
	int r1 = obj.multi(4, 9);
	
		
			System.out.println(r1);

		}

	}
}
 
 
