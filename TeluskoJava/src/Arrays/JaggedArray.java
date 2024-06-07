package Arrays;

public class JaggedArray {

    public static void main(String[] args) {

        int jaggedArray[][] = new int[][] {
            {1, 3},
            {3, 4, 6},
            {4, 6, 7, 8, 8}
        };

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
