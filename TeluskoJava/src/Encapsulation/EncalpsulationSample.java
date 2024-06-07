package Encapsulation;
  
	
class erosEmployee{
	
	private int id;
	private String name;
	
	public int getid(){
		return id;
	}
	public void setid(int a) {
		id = a;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String b) {
	name =b	;
	}
}
;
public class EncalpsulationSample {

	public static void main(String[] args) {
		erosEmployee emp = new erosEmployee();
		emp.setid(12);
		emp.setname("Hardik");
		System.out.println(emp.getname() + " " +emp.getid() );
		
		

	}

}
