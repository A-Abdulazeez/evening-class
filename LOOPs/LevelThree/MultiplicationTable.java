public class MultiplicationTable{
public static void main(String [] args){

for (int number =1; number <= 10 ; number++ ){ 
System.out.print(number + "  | "); 
for (int numberAcross =1; numberAcross <= 10 ; numberAcross++ ){ 
int multiplication = number * numberAcross;
System.out.print(multiplication + "  ");
}
System.out.println();
}

}
}
