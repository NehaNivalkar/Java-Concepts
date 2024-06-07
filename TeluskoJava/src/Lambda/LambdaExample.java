package Lambda;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
//Now, you can use a lambda expression to implement this interface without having to create a separate class:
// Remeber> Lambda Expression only works with a functional interface

public class LambdaExample {

	public static void main(String[] args) {
	
		Calculator addition = (a,b) -> a+b;

		int result = addition.calculate(7, 9);
		
		System.err.println("Result of addition is : " + result );
	}

}
