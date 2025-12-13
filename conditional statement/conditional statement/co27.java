import java.util.Scanner;
public class co27 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = Sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Letter");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Letter");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Symbol");
        }
        Sc.close();
    }
}
