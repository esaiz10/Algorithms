public class Q4 {
    public static int mystery(int a, int b) {
        System.out.printf("mystery(%d, %d) called.%n", a, b); // Debug message
        if (b == 0) {
            System.out.printf("Returning 0 since b == 0.%n");
            return 0;
        }
        if (b % 2 == 0) {
            System.out.printf("b is even. Calling mystery(%d, %d).%n", a + a, b / 2);
            return mystery(a + a, b / 2);
        }
        System.out.printf("b is odd. Calling mystery(%d, %d) and adding %d.%n", a + a, b / 2, a);
        return mystery(a + a, b / 2) + a;
    }

    public static void main(String[] args) {
        System.out.println("Result of mystery(2, 25):");
        int result1 = mystery(2, 25);
        System.out.println("Result: " + result1);

        System.out.println("\nResult of mystery(3, 11):");
        int result2 = mystery(3, 11);
        System.out.println("Result: " + result2);
    }
}




