import java.util.Scanner;

public class FactorialOfNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int factorial = 1;
System.out.print("Enter Number: ");
int number = scanner.nextInt();
int index = 1;
for(;index <= number; index++){
factorial *= index;
}
System.out.println(number + " factorial is: " + factorial);

}
}
