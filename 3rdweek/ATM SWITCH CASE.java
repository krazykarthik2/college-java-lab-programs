import java.lang.*;
import java.util.*;

class ATM {
    public static void main(String[] args) {
        int amount = 0;
        int choice = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to deposit");
            System.out.println("Enter 2 to withdraw");
            System.out.println("Enter 3 to check balance");
            System.out.println("Enter 4 to exit");
            choice = scan.nextInt();
            switch (choice) {
                case 1:// Deposit
                    System.out.println("Enter the amount to be deposited");
                    int deposit = scan.nextInt();
                    amount += deposit;
                    break;
                case 2:// Withdraw
                    System.out.println("Enter the amount to be withdrawn");
                    int withdrawn = scan.nextInt();
                    if (withdrawn > amount)
                        System.out.println("Insufficient balance");
                    else
                        amount -= withdrawn;
                    break;
                case 3:// Balance
                    System.out.println("The current balance is " + amount);
                    break;
                case 4:// Exit
                    scan.close();
                    System.exit(0);
                    break;
                default:// Invalid Choice
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
