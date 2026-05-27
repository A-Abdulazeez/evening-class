import java.util.Scanner;

public class LargestNumber{
public static void main(String... args){
Scanner input = new Scanner(System.in);

int largest = Integer.MIN_VALUE;
int index = 1;
for (;index <= 5; index ++){
System.out.print("Enter number: ");
int userInput = input.nextInt();
if (userInput > largest){
largest = userInput;
}
}

System.out.println("The largest is " +largest);


}
}