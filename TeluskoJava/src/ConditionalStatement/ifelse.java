package ConditionalStatement;
import java.util.Scanner;


public class ifelse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int userInput = scanner.nextInt();
		if (userInput > 15) {
            System.out.println(userInput + " is greater than 15.");
        } else {
            System.out.println(userInput + " is smaller than or equal to 15.");
        }
		scanner.close();
		
	}}
