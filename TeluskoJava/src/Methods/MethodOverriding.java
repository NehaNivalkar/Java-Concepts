package Methods;

class Calc{
	public int add(int a, int b) {
		return a+b;
	}
}

class AdvCalc extends Calc{
	public int add(int a, int b ) {
		return a+b+3;
}
public class MethodOverriding {

	public static void main(String[] args) {
		
AdvCalc obj = new AdvCalc();
int c = obj.add(1, 2);

System.out.println(c);


	}

}}
