package BasicPrograms;
class P{
	public void show() {
		System.out.println("In P");
	}
	
}
class Q {
	public void show() {
		System.out.println("In P");
	}
public class ToStringMethod {

	public static void main(String[] args) {
		
P obj1 = new P();
Q obj2 = new Q();

System.out.println(obj1.equals(obj2));
	}

}}
