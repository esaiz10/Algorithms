import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//13.1.1
public class Q1 {
    public static void main(String[] args) {
     // Create a symbol table (HashMap) mapping letter grades to numerical scores
        Map<String, Double> gradeToScoreMap = new HashMap<>();
        gradeToScoreMap.put("A", 4.0);
        gradeToScoreMap.put("B", 3.0);
        gradeToScoreMap.put("C", 2.0);
        gradeToScoreMap.put("D", 1.0);
        gradeToScoreMap.put("F", 0.0);


                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter letter grades separated by spaces (e.g., A B+ C):");
                String input = scanner.nextLine();
                String[] grades = input.split("\\s+"); // Split input into an array of grades

                // Calculate GPA
                double totalScore = 0.0;
                int gradeCount = 0;

                for (String grade : grades) {
                    Double score = gradeToScoreMap.get(grade);
                    if (score != null) {
                        totalScore += score;
                        gradeCount++;
                    } else {
                        System.out.println("Invalid grade encountered: " + grade);
                    }
                }

                if (gradeCount > 0) {
                    double gpa = totalScore / gradeCount;
                    System.out.printf("GPA: %.2f%n", gpa);
                } else {
                    System.out.println("No valid grades provided. Cannot compute GPA.");
                }

                scanner.close();
            }
        }