import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        // Unordered list of book titles
        String[] bookTitles = {
                "The Great Gatsby",
                "Moby Dick",
                "To Kill a Mockingbird",
                "1984",
                "Pride and Prejudice"
        };

        // Output the original unsorted list
        System.out.println("Original List of Book Titles:");
        System.out.println(Arrays.toString(bookTitles));

        // Sort the book titles array using Selection.sort
        Selection.sort(bookTitles);

        // Output the sorted list
        System.out.println("Sorted List of Book Titles:");
        System.out.println(Arrays.toString(bookTitles));

        // Expected output for manual verification
        System.out.println("Expected Order:");
        System.out.println(Arrays.toString(new String[]{
                "1984",
                "Moby Dick",
                "Pride and Prejudice",
                "The Great Gatsby",
                "To Kill a Mockingbird"
        }));
    }
}

class Select {
    public static void sort(Comparable[] a) {
        int N = a.length; // array length
        for (int i = 0; i < N; i++) {
            int min = i; // index of minimal entry
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
