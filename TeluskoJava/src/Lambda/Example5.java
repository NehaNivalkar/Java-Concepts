package Lambda;

interface Addition{
	int add(int a, int b);
}
public class Example5 {

	public static void main(String[] args) {
		
		Addition obj = (a,b)->  (a+b);
		int result = obj.add(5, 8);
		System.out.println(result);
	}

}
