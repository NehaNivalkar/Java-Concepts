package Final;
// to stop inheritance i.e when someone will try to extend the class , we stop them usimg extend keyword

final class A{       	//if we use final keyword, we cannot use this class below
	public void show() {
		System.out.println("Hello");
	}
}

/* class B extends A{	 		// cant be used since the class A is final
	public void see() {
		System.out.println("Hi");
	}
	
} */
public class FinalClass {

	public static void main(String[] args) {
		

	}

}
