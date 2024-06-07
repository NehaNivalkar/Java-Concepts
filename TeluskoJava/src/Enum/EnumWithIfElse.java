package Enum;
enum Status{
	Running, Failed, Pending, Success;
}
public class EnumWithIfElse {

	public static void main(String[] args) {
	Status ss =  Status.Pending;
	
	if (ss == Status.Success) 
		System.out.println("Yes Its successful");
	else if (ss == Status.Failed) 
		System.out.println("It Failed");
	else if (ss == Status.Pending)
		System.out.println("Still Pending");
	else
		System.out.println("Running");
	

	}

}
