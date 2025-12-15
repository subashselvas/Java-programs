import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000; 
        System.out.println("Mini ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Balance: $" + balance);
                break;
            case 2:
                double deposit = sc.nextDouble();
                balance += deposit;
                System.out.println("New Balance: $" + balance);
                break;
            case 3:
                double withdraw = sc.nextDouble();
                if(withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("New Balance: $" + balance);
                } else {
                    System.out.println("Insufficient balance!");
                }
                break;
            case 4:
                System.out.println("Thank you! Goodbye.");
                break;
            default:
                System.out.println("Invalid option!");
        }

        sc.close();
    }
}
