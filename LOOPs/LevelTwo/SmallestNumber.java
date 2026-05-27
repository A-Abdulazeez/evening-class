import java.util.Scanner;

public class SmallestNumber{
public static void main(String... args){
Scanner input = new Scanner(System.in);

int smallest = Integer.MAX_VALUE;
int index = 1;
for (;index <= 5; index ++){
System.out.print("Enter number: ");
int userInput = input.nextInt();
if (userInput < smallest){
smallest = userInput;
}
}

System.out.println("The smallest is " +smallest);


}
}