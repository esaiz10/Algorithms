import java.util.LinkedList;
import java.util.Scanner;

    public class Q5 {
        public static void main(String[] args) {
            LinkedList<Character> list = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a sequence of characters (press Ctrl+D to end):");
            while (scanner.hasNext()) {
                String input = scanner.nextLine();
                for (char c : input.toCharArray()) {
                    if (list.contains(c)) {
                        list.remove((Character) c);
                        System.out.println("Duplicate found: '" + c + "'. Moving to front...");
                    } else {
                        System.out.println("Unseen character: '" + c + "'. Adding to front...");
                    }
                    list.addFirst(c);
                }
                System.out.println("Current list: " + list);
            }

            scanner.close();
        }
    }

