package Encapsulation;
	 
	 class Eros {
		 
		private String empName = "Hardik";
		private int salary = 2;
		
		public String getEmpName() {
			return empName;
		}
		
		public int getSalary() {
			return salary;
		}
		 
	 }
public class Getters {

	public static void main(String[] args) {
		
		Eros obj = new Eros();
		System.out.println(obj.getEmpName() + " " + obj.getSalary());
		

	}

}
