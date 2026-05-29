import java.util.Scanner;

public class CountDigits {
public static void main(String... azPaps) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = scanner.nextInt();
int count = 0;

while (number != 0) {
number = number / 10;
count++;
}

if (number == 0 && count == 0) {
count = 1;
}        
System.out.println("The count of digits is: " + count);
}
}