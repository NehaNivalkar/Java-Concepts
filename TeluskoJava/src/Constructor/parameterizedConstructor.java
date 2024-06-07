package Constructor;


class pmConst{
	
	String name;
	
	public pmConst(String x) {
		
		 name = x;
		
	}
	public void show() {
		System.out.println(name);
	}
	
}
	public class parameterizedConstructor {
		
		public static void main(String[] args) {
	

		pmConst obj = new pmConst("HARDIK");
		
		obj.show();
		
		
		}		
		
}
