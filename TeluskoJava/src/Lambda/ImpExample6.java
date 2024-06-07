package Lambda;
@FunctionalInterface
interface F{
	void show(int i);
}
public class ImpExample6 {

	public static void main(String[] args) {
		
		// Regular Expression
/*		F obj = new F() {

			@Override
			public void show(int i) {
				System.out.println("In show " + i);
				
			}
		};
		obj.show(7);		*/
		
		// LAMBDA EXPRESSION
		F obj = (i) -> System.out.println("In show " + i);  //we dont need to declare variable type as int, since we have already declared it on the 4th line
		obj.show(7);
		
	}}