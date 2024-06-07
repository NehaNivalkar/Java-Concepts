package Methods;
	
	class A{
		
		public A( ) {				//if we don't have a parameterized constructor it will call a default constructor.
			super();
			System.out.println("in A");  
		}
		
		public A(int n) {
			super();
			System.out.println("in A int");
		}
}

	class B extends A{
		
		public B() {
			super();
			System.out.println("in B");
		}
		
		public B(int n) {
			
			this();                //this will call constructor of the same class 
			System.out.println("in B int");
		}
	
	
}
public class SuperAndThisMethod {

	public static void main(String[] args) {
	

		B obj = new B(2);
		// whenever we create object of class it will call constructor of both ( super class and subclass)
		// when we run the code it will print "in A" and "in B int".
		// since we have passed 2 in the object creation it will run code from line 26 but now we have added super() method,
		// but we have not added any argument in super method, which passed default constructor i.e "in A" 
		// if we pass value in super() on 26th line , it would pass parameterized constructor with the following o/p
		// in A 
		// in B 
		// in B int

	}

}
