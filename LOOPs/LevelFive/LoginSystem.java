import java.util.*;

public class LoginSystem{
public static void main(String... donPaps){
Scanner input = new Scanner(System.in);


int count = 0;
while(true){
System.out.println("Enter username: ");
String userName = input.nextLine();

System.out.println("Enter password: ");
String userInput = input.nextLine();

if (userName.equals(userName) && userInput.equals("0000")){
System.out.println("access granted");
return;
}

count +=1;

if (count == 3){
System.out.println("Too many attempts, contact customer service");
break;
}
System.out.println("invalid username and password");
}

}
}
