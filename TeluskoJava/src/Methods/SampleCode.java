package Methods;
class hardik{
	public void name() {						//void means it will not return any value.
		System.out.println("What is my name?");
	}
	
	public String giveMeThatPen(int cost) {				//add required data type , here it is String
		if (cost>10)
		return "Pen";								// it will only display if value is passed in the int cost bracket.
		else 
			return "theek se price set kar";
	}
}
public class SampleCode {

	public static void main(String[] args) {
		
		hardik obj = new hardik();
		obj.name();
		String c = obj.giveMeThatPen(2);
		System.out.println(c);



	}

}
