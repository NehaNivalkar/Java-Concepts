package Interface;
@FunctionalInterface
interface M{
	void show();
}

class N implements M{
	@Override
	public void show() {
		System.out.println("In A show");
		
	}
}
 
class FunctionalInterfaceSampleProgram{
	public static void main(String[] args) {
		 
		M obj =  new N();
		obj.show();
		
	}
}
