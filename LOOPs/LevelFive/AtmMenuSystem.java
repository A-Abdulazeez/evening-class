import java.util.Scanner;

public class AtmMenuSystem {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

double accountBalance = 1000.00;

while (true) {
            System.out.println("""
            ===== ATM MENU =====
           1. Check Balance
           2. Deposit
           3. Withdraw
           4. Exit
           """);

System.out.println("Choose an option: ");
int menuOption = scanner.nextInt();

switch (menuOption) {
                case 1:
                    System.out.println("Current Balance: ₦" + accountBalance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₦");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount > 0) {
                        accountBalance += depositAmount;
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ₦");
                    double withdrawalAmount = scanner.nextDouble();

                    if (withdrawalAmount > 0 && withdrawalAmount <= accountBalance) {
                        accountBalance -= withdrawalAmount;
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
}
}
}
}
