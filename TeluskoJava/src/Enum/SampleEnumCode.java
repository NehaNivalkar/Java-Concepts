package Enum;
enum Status{
	Running, Failed, Pending, Success;
}
public class SampleEnumCode {

	public static void main(String[] args) {
		Status s =  Status.Success;
		System.out.println(s.name());
		System.out.println(s.ordinal());
		for (Status myVar : Status.values()) {
			  System.out.println(myVar);
			}
	}

}
