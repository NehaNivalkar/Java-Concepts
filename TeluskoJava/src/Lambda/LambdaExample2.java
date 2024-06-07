package Lambda;
@FunctionalInterface
interface D{
	void show();
}
public class LambdaExample2 {

	public static void main(String[] args) {
		
		D obj = () -> System.out.println("In D show");
		
		obj.show();
		

	
}
}