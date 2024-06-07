package MultipleClass;
class A{
	  // only inner class can be made static
	public void show1() {
		System.out.println("in A show");
	}
	
	static class B{			//we can also make this class as static, so we do not have to create object of this class
		public void show2() {
			System.out.println("In B show");
		}
	}
}
public class ClassInsideClass {

	public static void main(String[] args) {
		
		A obj1 = new A();
//		A.B obj2 = obj1.new B();
//		obj2.show2();
/*	 A.B obj2 = new A.B();     whem class is declared static we do not have to create new obj
	 obj2.show2();       */
}
	

}
