public class SumOneTofifty{
public static void main(String... args){

int sum = 0;
int index = 0;
while(index<50){
index++;
if (index % 2 ==0){
sum+= index;
}
}
System.out.println(sum);
}
}