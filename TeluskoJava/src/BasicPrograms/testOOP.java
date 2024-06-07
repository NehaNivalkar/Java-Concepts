package BasicPrograms;
class book{
	String bookName, Author;
	public void display() {
		System.out.println("Book Name : " + bookName);
		System.out.println("Author Name : " + Author);
		
	}
}
public class testOOP {

	public static void main(String[] args) {
		
		book bookdata = new book();
		
		bookdata.bookName = "Harry Potter";
		bookdata.Author = "J.K Rowling";
		
		bookdata.display();
		

	}

}
