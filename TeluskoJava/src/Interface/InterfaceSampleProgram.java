package Interface;
/*Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not
possible to create an "Animal" object in the MyMainClass) 
Interface methods do not have a body - the body is provided by the "implement" class */
// By default every method in an interface is public and abstract
//every variable in an interface are final and static.

 interface Animal{
	 
	 final static int age = 25;      // initialization is not allowed, we have to declare it age = 25.
	final static String name = "Hardik";
	 void animalSound();
	 void sleep();
}
 
 class Pig implements Animal{

	@Override
	public void animalSound() {
		System.out.println("Bark");
		
	}

	@Override
	public void sleep() {
		System.out.println("ZZZZ");
		
	}
	 
 }
 
 
public class InterfaceSampleProgram {

	public static void main(String[] args) {
		
		Animal obj = new Pig();
		obj.animalSound();
		obj.sleep();
		System.out.println(obj.name);	

	}

}
