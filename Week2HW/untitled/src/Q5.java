import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        // Array of letters
        char[] letters = {'Z', 'E', 'Q', 'A', 'C', 'M', 'B'};

        System.out.println("Original Letters: " + Arrays.toString(letters));

        // Apply Quick Sort
        quickSort(letters, 0, letters.length - 1);
        System.out.println("Sorted Letters: " + Arrays.toString(letters));
    }

    // Quick Sort Algorithm
    public static void quickSort(char[] letters, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(letters, low, high);

            // Recursively sort left and right partitions
            quickSort(letters, low, pivotIndex - 1);  // Left of pivot
            quickSort(letters, pivotIndex + 1, high); // Right of pivot
        }
    }

    // Partition function to divide the array
    private static int partition(char[] letters, int low, int high) {
        char pivot = letters[high]; // Pick last element as pivot
        int i = low - 1; // Index to place smaller elements

        for (int j = low; j < high; j++) {
            // Compare values and place smaller elements before pivot
            if (letters[j] <= pivot) {
                i++;
                swap(letters, i, j);
            }
        }

        swap(letters, i + 1, high);
        return i + 1;
    }

    // Swap function to exchange elements
    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}