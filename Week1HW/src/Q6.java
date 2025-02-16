import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java KthFromLast <k>");
            return;
        }

        int k = Integer.parseInt(args[0]);
        if (k <= 0) {
            System.out.println("k must be a positive integer.");
            return;
        }

        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings (one per line). Press Ctrl+D (on macOS/Linux) or Ctrl+Z (Windows) to stop:");

        while (scanner.hasNext()) {
            String input = scanner.nextLine();

            queue.add(input);

            // If the queue size exceeds `k`, remove the oldest element
            if (queue.size() > k) {
                queue.poll();
            }
        }

        scanner.close();

        // If we have fewer than `k` strings, print an error message
        if (queue.size() < k) {
            System.out.println("Error: The input has fewer than " + k + " strings.");
        } else {
            // The front of the queue is the kth from the last string
            System.out.println("The " + k + "th from the last string is: " + queue.peek());
        }
    }
}
