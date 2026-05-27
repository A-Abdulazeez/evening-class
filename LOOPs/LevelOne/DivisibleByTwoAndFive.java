public class DivisibleByTwoAndFive{
public static void main(String... args){

int index = 1;
for (;index <= 100; index++) {
if ( index % 2 == 0 && index % 5== 0){
System.out.println(index);
}
}
System.out.println();

}
}