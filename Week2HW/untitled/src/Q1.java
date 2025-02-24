public class Q1 {
    public static void main(String[] args) {
        String[] array = {"Z", "E", "X", "B", "A"}; // Example test data
        Selection.sort(array);
    }
}


public class Selection {
    public static void sort(Comparable[] a) {
}
    int N = a.length; // array length
    for (int i = 0; i < N; i++) {
        int min = i; // index of minimal entry
        for (int j = i + 1; j < N; j++) {
            if (less(a[j], a[min])) min = j;
        }
        System.out.println("Exchanging " + a[i] + " with " + a[min]);
        exch(a, i, min);
        System.out.println("Array after step " + i + ": " + java.util.Arrays.toString(a));
    }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
