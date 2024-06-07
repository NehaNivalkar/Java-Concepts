package Arrays;

public class creatinMultidimentionalArrayAndAddingRandomValue {

    public static void main(String[] args) {
        int[][] array = new int[3][4];

        // Populate the array with random values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                double randomValue = Math.random() * 100;
                int randomIntValue = (int) randomValue;
                array[i][j] = randomIntValue;
            }
        }

        // Print the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
