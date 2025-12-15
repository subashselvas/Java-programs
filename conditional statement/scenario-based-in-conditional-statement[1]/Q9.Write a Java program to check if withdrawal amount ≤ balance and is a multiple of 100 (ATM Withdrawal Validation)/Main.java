import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int withdraw = sc.nextInt();
        if (withdraw <= balance && withdraw % 100 == 0)
            System.out.println("Withdrawal Successful");
        else
            System.out.println("Invalid Withdrawal");
    }
}
