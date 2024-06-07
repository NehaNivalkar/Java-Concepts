package BasicPrograms;

public class thisKeyword {
    private int number;
public thisKeyword(int number) {
         this.number = number;
    }
    public void displayNumber() {
        System.out.println("Number: " + this.number);
    }
 public static void main(String[] args) {
        thisKeyword instance = new thisKeyword(42);
        instance.displayNumber();
        
    }
}

