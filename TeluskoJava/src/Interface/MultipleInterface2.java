package Interface;

interface P{
	
	void show();
	
}

interface Q{
	void speak();
}

interface R extends P{
	
}

class Z implements Q,R{

	@Override
	public void show() {
		System.out.println("In P");
		
	}

	@Override
	public void speak() {
		System.out.println("In Q");
		
	}
	
	
}

public class MultipleInterface2 {

	public static void main(String[] args) {
		
		Z obj = new Z();
		obj.show();
		obj.speak();
	
	}

}
