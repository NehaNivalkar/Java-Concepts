package Encapsulation;
	 
class Eros2 {
	 
	private String empName ;
	private int salary ;
	
	public void setEmpName(String a) {
		empName = a;
	}
	public String getEmpName() {
		return empName;
	}
	
	public void setSalary(int b) {
		salary = b;
	}
	public int getSalary() {
		return salary;
	}
}
public class Setters {

	public static void main(String[] args) {
		
		Eros2 obj = new Eros2();
		obj.setEmpName("HARDIK NAIK");
		obj.setSalary(2);
		
		System.out.println(obj.getEmpName() + " " + obj.getSalary());
		
		

	}

}
