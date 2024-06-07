package Interface;
interface A{
	public void show() ;
	}

interface B{
	public void show2();
}

class C implements A,B{

	@Override
	public void show() {
		
		System.out.println("In A show");
		
	}

	@Override
	public void show2() {
		System.out.println("In B show");
		
	}
	
}
/* Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, 
it can be achieved with interfaces, because the class can implement multiple interfaces. Note: 
To implement multiple interfaces, separate them with a comma (see example below).  */
public class MultipleInterface {

	public static void main(String[] args) {
		 
		C obj = new C();
		obj.show();
		obj.show2();

	}

}
