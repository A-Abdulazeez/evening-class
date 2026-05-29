import java.util.*;

public class AverageOfNumbers{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int sum = 0;
int average = 0;
int count = 0;
int userInput = 0;
while(true){
System.out.println("Enter a number or enter -1 to stop");
userInput = input.nextInt();
if(userInput == -1){
break;
}
else {
count += 1;
sum += userInput;
average = sum/count;
}
}

System.out.println("The average is: " + average);
}
}