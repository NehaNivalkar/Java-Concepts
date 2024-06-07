package AnonymousClass;

abstract class AB{
	public abstract void show();
	public abstract void config();
}
public class AnonymousAbstractInnerClassImplementation {

	public static void main(String[] args) {
		AB obj = new AB() {
			public void show() {
				System.out.println("In show");
				
			}

			public void config() {
				System.out.println("In config");
				
			}
			
		};
		obj.show();
		obj.config();
		
/*an abstract anonymous class is a combination of an anonymous class and an abstract class.
  An abstract class is a class that cannot be instantiated on its own, and it often contains abstract methods 
  that must be implemented by its subclasses. Combining this with the concept of an anonymous class allows you to 
   create a one-time-use abstract class with an implementation. */
 
	}

}
