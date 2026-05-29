import java.util.Scanner;


//all this  method way i dey use. is just to also master method  so like using one stone to kill 2 birds
public class SumDigits {
public static int sumDigits(long number) {
number = Math.abs(number);
int sum = 0;

while (number != 0) {
sum += number % 10;
number /= 10;
}
return sum;
}

public static void main(String... azPaps) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
long number = input.nextLong();

System.out.println("The sum of the numbers is " + sumDigits(number));
}
}