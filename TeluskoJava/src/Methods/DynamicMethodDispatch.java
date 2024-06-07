package Methods;
 class D{
	public void show() {
		System.out.println("in D show");
	}
 }
 
 class E extends D{
	 public void show() {
			System.out.println("in E show");
		}
 }
 class F extends D{
	 public void show() {
			System.out.println("in F show");
		}
 }
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		D obj = new D();
		obj.show();
		obj = new E();
		obj.show();
		obj = new F();
		obj.show();
		
	}

}
