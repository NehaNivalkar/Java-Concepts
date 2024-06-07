package BasicPrograms;
class simpleProg{
	private String name;
	
	public simpleProg(String name) {
		this.name = name;
	}
	
	void show() {
		System.err.println(name);
	}
	
}
public class thiskeyword2 {
	public static void main(String[] args) {
		simpleProg sp = new simpleProg("HARDIK NAIK");
		
		sp.show();
	}

}
