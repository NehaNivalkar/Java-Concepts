package Constructor;
	 

 	class constructor{
 		int a;
 		String name;
 		
 		void show() {
 			System.out.println(a + " " + name);
 		}
 	}
public class TestConstructor {
	public static void main(String[] args) {
		constructor obj = new constructor();
		obj.show();
	}
}
