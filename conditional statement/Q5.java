import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int ch = sc.nextInt();
        switch(ch) {
            case 1:
                System.out.println("Balance = " + balance);
                break;

            case 2:
                int amt1 = sc.nextInt();
                balance = balance + amt1;
                System.out.println("Balance = " + balance);
                break;

            case 3:
                int amt2 = sc.nextInt();
                if(amt2 > balance)
                    System.out.println("No Money");
                else {
                    balance = balance - amt2;
                    System.out.println("Balance = " + balance);
                }
                break;

            default:
                System.out.println("Invalid");
        }
    }
}