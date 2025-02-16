public class Q2 {
    public static void main(String[] args) {
        boolean[][] array = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };


        System.out.print("  ");
        for (int col = 0; col < array[0].length; col++) {
            System.out.print(col + " ");
        }
        System.out.println();

        for (int row = 0; row < array.length; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] ? "*" : " ");
            }
            System.out.println();
        }
    }
}