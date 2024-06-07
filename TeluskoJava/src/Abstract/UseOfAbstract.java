package Abstract;
//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass
abstract class animal{
	public abstract void animalsound();
	public void sleep() {
	    System.out.println("Zzz");
	  }
	
}
class Pig extends animal{


	public void animalsound() {
		
		System.out.println("Hello Animal");
	}
	
}
public class UseOfAbstract {

	public static void main(String[] args) {
	
	//	animal myObj = new animal(); // will generate an error//
		
		Pig obj2 = new Pig();
		obj2.animalsound();
		obj2.sleep();

	}
	

}
