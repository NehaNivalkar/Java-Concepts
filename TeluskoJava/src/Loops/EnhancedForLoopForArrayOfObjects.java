package Loops;


class Student{
int age;
String name;
int marks;
}
public class EnhancedForLoopForArrayOfObjects {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Hardik";
		s1.age = 25;
		s1.marks = 10;
		
		Student s2 = new Student();
		s2.age = 22;
		s2.name= "Ash";
		s2.marks = 9;
		
		Student s3 = new Student();
		s3.age = 12;
		s3.name = "Alex";
		s3.marks =8;
		
		
		Student std[] =   new Student[3]	;
		
		std[0]= s1;
		std[1] = s2;
		std[2] = s3;
		
		for(Student stud: std) {
			System.out.println(stud.age);
		}

	}

}
