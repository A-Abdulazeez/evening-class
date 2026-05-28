import java.util.Scanner;

public class HollowSquare {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter side length: ");
int number = scanner.nextInt();

for (int row = 1; row <= number; row++) {
for (int column = 1; column <= number; column++) {
if (row == 1 || row == number || column == 1 || column == number) {
 System.out.print("* ");
 }
 else {
 System.out.print("  "); 
  }
  }
 
 System.out.println();
}

}
}

