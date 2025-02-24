import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        Integer[] dataset1 = {4, 3, 1, 5, 2}; // Random unordered data
        Integer[] dataset2 = {1, 2, 3, 4, 5}; // Already sorted data
        Integer[] dataset3 = {5, 4, 3, 2, 1}; // Reversed order data

        System.out.println("Original: " + Arrays.toString(dataset1));
        Selection.sort(dataset1);
        System.out.println("Sorted: " + Arrays.toString(dataset1));

        System.out.println("Original: " + Arrays.toString(dataset2));
        Selection.sort(dataset2);
        System.out.println("Sorted: " + Arrays.toString(dataset2));

        System.out.println("Original: " + Arrays.toString(dataset3));
        Selection.sort(dataset3);
        System.out.println("Sorted: " + Arrays.toString(dataset3));
    }
}

class Selection {
    public static void sort(Comparable[] a) {
        int N = a.length; // array length
        for (int i = 0; i < N; i++) {
            int min = i; // index of the minimal entry
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) min = j;
            }
            System.out.println("Exchanging " + a[i] + " with " + a[min]);
            exch(a, i, min);
            System.out.println("After step " + i + ": " + Arrays.toString(a));
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
