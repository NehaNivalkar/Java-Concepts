package BasicPrograms;

import java.util.Objects;

class Laptop{
	private String name;
	private int price;
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
		
}
public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
