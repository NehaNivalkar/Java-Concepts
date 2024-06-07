package Exceptions;
class CE extends Exception{
	public CE(String message) {
		super(message);
	}
}
class CustomExceptionExample {
    // Method that throws custom exception
    public void processInput(int value) throws CE {
        if (value < 0) {
            throw new CE("Input value cannot be negative");
        } else {
            System.out.println("Input value is: " + value);
        }
    }

    public static void main(String[] args) {
        CustomExceptionExample example = new CustomExceptionExample();

        try {
            // Calling the method with a negative value to trigger the custom exception
            example.processInput(-5);
        } catch (CE e) {
            // Handling the custom exception
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }
}
