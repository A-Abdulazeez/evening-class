import java.util.Scanner;

public class SumOfUserNumbers{
public static void main(String... args){
Scanner myScanner = new Scanner(System.in);
int sum = 0;
int index = 0;
int userInput = 0;
for(;index < 5; index++){
System.out.print("Enter number: ");
userInput = myScanner.nextInt();

sum+= userInput;
}

System.out.println("The sum is: " + sum);
}
}