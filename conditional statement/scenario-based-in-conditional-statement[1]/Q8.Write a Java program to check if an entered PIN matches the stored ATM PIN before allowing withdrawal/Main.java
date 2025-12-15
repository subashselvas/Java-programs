import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storedPin = 1234;
        int enteredPin = sc.nextInt();
        if (storedPin == enteredPin)
            System.out.println("PIN Matched");
        else
            System.out.println("Incorrect PIN");
    }
}
