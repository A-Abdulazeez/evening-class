import java.util.*;

public class GuessingGame{
public static void main(String... args){
Scanner input = new Scanner(System.in);
Random ramdom = new Random();

int rand = ramdom.nextInt(100);
int userInput = 0;

while(true){
System.out.print("Guess the number: ");
userInput = input.nextInt();

if(userInput == rand){
System.out.println("you won");
break;
}

else {

if(userInput < rand){
System.out.println("guess a higher number");
continue;
}

else if(userInput > rand){
System.out.println("guess a lower number");
continue;
}
}

}
}
}
