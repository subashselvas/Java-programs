import java.util.Scanner;

public class co30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first character: ");
        char ch1 = sc.next().charAt(0);
        System.out.print("Enter second character: ");
        char ch2 = sc.next().charAt(0);
        if (ch1 == ch2) {
            System.out.println("Both characters are equal.");
        } else {
            System.out.println("Characters are NOT equal.");
        }
        sc.close();
    }
}
