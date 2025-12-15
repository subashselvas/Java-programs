import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        if (number.length() >= 10)
            System.out.println("Valid Number");
        else
            System.out.println("Invalid Number");
    }
}
