
import java.util.Arrays;

public class Q2 {

    public static void main(String[] args) {
        int n = 10;

        // O(1) example
        System.out.println("O(1) Output: " + constantTimeExample(n));

        // O(log n) example
        System.out.println("O(log n) Output: " + logTimeExample(n));

        // O(n) example
        System.out.println("O(n) Output: " + linearTimeExample(n));

        // O(n log n) example
        System.out.println("O(n log n) Output: " + nLogNTimeExample(n));

        // O(n^2) example
        System.out.println("O(n^2) Output: " + quadraticTimeExample(n));

        // O(2^n) example
        System.out.println("O(2^n) Output: " + exponentialTimeExample(n));

        // O(n!) example
        System.out.println("O(n!) Output: " + factorialTimeExample(n));
    }

    // O(1): Constant time
    public static int constantTimeExample(int n) {
        return n * n; // Simple mathematical operation
    }

    // O(log n): Logarithmic time
    public static int logTimeExample(int n) {
        int count = 0;
        while (n > 1) {
            n /= 2; // Keep dividing by 2
            count++;
        }
        return count; // Number of divisions by 2 is proportional to log(n)
    }

    // O(n): Linear time
    public static int linearTimeExample(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i; // Loop runs n times
        }
        return sum;
    }

    // O(n log n): Linearithmic time
    public static int nLogNTimeExample(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = n - i; // Initialize an array
        }
        Arrays.sort(array); // Sorting takes O(n log n)
        return array[0]; // Return smallest element (after sorting)
    }

    // O(n^2): Quadratic time
    public static int quadraticTimeExample(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += i + j; // Loop runs n*n times
            }
        }
        return sum;
    }

    // O(2^n): Exponential time
    public static int exponentialTimeExample(int n) {
        if (n == 0) return 1; // Base case
        return 2 * exponentialTimeExample(n - 1); // Double the output for every recursive step
    }

    // O(n!): Factorial time
    public static int factorialTimeExample(int n) {
        if (n == 0) return 1; // Base case
        return n * factorialTimeExample(n - 1); // Factorial recursive calculation
    }
}