package Lambda;
@FunctionalInterface
interface K{
	int add(int a , int b);
}

public class LambdaExpressionWithReturn {

	public static void main(String[] args) {
		
/*		K obj = new K() {
			public int add(int a,int b) {
				return a+b;
			}
		};
		int result = obj.add(5, 7);
		
		System.out.println(result);
		*/
		
		K obj = (a,b) -> a+b;
		int result = obj.add(8,9);
		System.out.println(result);
	}

}
