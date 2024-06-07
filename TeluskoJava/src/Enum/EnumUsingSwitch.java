package Enum;
enum Status{
	Running, Failed, Pending, Success;
}
public class EnumUsingSwitch {

	public static void main(String[] args) {
		
		Status s = Status.Failed;
		
		switch (s) {
		case Running: {
			System.out.println("Yes Its Running");
			break;
		}
		case Failed: {
			System.out.println("It Failed");
			break;
		}
		case Pending: {
			System.out.println("Still Pending");
		}
		default:
		System.out.println("Yes Its successfull");
			
		}
		
		

	}

}
