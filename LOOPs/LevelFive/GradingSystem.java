import java.util.Scanner;

public class GradingSystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

String continueChoice;
do {
System.out.print("Enter student score (0 - 100): ");
int score = scanner.nextInt();

char gradeLetter;

            if (score >= 90) {
                gradeLetter = 'A';
            } 
            else if (score >= 80) {
                gradeLetter = 'B';
            } 
            else if (score >= 70) {
                gradeLetter = 'C';
            } 
            else if (score >= 60) {
                gradeLetter = 'D';
            } 
            else {
                gradeLetter = 'F';
            }

switch (gradeLetter) {
                case 'A':
                    System.out.println("Grade: A - Excellent");
                    break;

                case 'B':
                    System.out.println("Grade: B - Very Good");
                    break;

                case 'C':
                    System.out.println("Grade: C - Good");
                    break;

                case 'D':
                    System.out.println("Grade: D - Pass");
                    break;

                case 'F':
                    System.out.println("Grade: F - Fail");
                    break;

                default:
                    System.out.println("Invalid grade.");
            }

System.out.print("Do you want to grade another student? (yes/no): ");
continueChoice = scanner.next();

        } 
while (continueChoice.equalsIgnoreCase("yes"));

System.out.println("Grading system Exited");
}
}
