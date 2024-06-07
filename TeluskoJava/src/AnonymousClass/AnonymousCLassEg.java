package AnonymousClass;
class A{
	public void show() {
		System.out.println("in A show");
	}
}
public class AnonymousCLassEg {

	public static void main(String[] args) {
		
		A obj = new A() {
			public void show() {
				System.out.println("in new show");     //In Java, an anonymous class is a class without a name. It's often used for one-time use,
			}
		};
		obj.show();
	
}
}