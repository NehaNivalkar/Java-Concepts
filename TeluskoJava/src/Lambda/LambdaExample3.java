package Lambda;
@FunctionalInterface
interface E{
	void show();
}
public class LambdaExample3 {

	public static void main(String[] args) {
		
		E obj = ()-> System.out.println("In E show");
		obj.show();
	}

}
