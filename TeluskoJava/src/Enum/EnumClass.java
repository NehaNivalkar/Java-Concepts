package Enum;
enum Laptop{
	Dell(200),Lenovo(300),Hp(400),Samsung(500);
	private Laptop(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private int price;
}
public class EnumClass {

	public static void main(String[] args) {
		
	//	Laptop lap = Laptop.Hp; 
	//	System.out.println(lap.getPrice());
	//	lap.setPrice(800);
//		System.out.println(lap.getPrice());
		for (Laptop myVar : Laptop.values()) {
			  System.out.println(myVar + " " +myVar. getPrice());
			}
	}

}
