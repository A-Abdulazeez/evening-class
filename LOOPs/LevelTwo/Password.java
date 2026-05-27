import java.util.Scanner;

public class Password{
public static void main(String... args){
Scanner myScanner = new Scanner(System.in);
int password = 12345;
int userInput = 0;
while(true){
System.out.println("enter password");
userInput = myScanner.nextInt();

if(userInput == password){
 break;
}
else if (userInput != password){
System.out.println("try again");

continue;
}
}




}
}