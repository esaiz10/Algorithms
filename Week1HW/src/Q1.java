public class Q1 {
    public static void main(String[] args) {
        int N = 23;
        String s = "";

        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }

        System.out.println("Binary representation of " + N + " is: " + s);
    }
}
