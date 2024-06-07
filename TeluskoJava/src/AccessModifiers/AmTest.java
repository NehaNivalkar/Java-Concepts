package AccessModifiers;

public class AmTest {

	public static void main(String[] args) {
		AmPublic obj1 = new AmPublic();    
		int a = obj1.publicVariable;
		System.out.println(a);
		obj1.publicMethod();
		
		AmPrivate obj2 = new AmPrivate();
		//	int b = obj2.privateVariable;   // see this is not visible
		
		AmProtected obj3 = new AmProtected();
	int c =	obj3.protectedVariable;
	System.out.println(c);
		obj3.protectedMethod();
		
		AmDefault obj4 = new AmDefault();
	int d =	obj4.defaultVariable;
	System.out.println(d);

	}

}
