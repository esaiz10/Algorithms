public class Q3 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Transpose and print
        System.out.println("Transposed Array:");
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) { 
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
