public class PalindromeAndReverseNumber{

public static int reverse(int number){

int reversedNumber = 0;
while(number > 0){
int lastdigit = number % 10;
reversedNumber = reversedNumber * 10 + lastdigit;
number = number / 10;

}
return reversedNumber;
}

public static boolean isPalindrome(int number){
boolean isAPalindrome = false;
if (reverse(number) == number){
isAPalindrome = true;
}
return isAPalindrome;
}

public static void main(String[] args){
System.out.println(reverse(1231));
System.out.println(isPalindrome(1321));
}
}