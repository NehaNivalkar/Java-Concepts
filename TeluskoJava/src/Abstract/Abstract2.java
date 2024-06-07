package Abstract;
abstract class P{
	public abstract void display();
	
	public int add(int a , int b) {
		return a+b;
}
}
	class Q extends P{

		@Override
		public void display() {
			System.out.println("Hello Boy");			
		}
		
	}
	class R extends Q{
		public void display() {
			System.out.println("Hello hardik");			
		}
	}
public class Abstract2 {
		
	
	public static void main(String[] args) {

		Q obj = new Q();
		int c = obj.add(1,5);
		System.out.println(c);
		obj.display();
		R obj2 = new R();
		obj2.display();
		obj2.add(9,7);
		
		
		
		
		
	}

}
