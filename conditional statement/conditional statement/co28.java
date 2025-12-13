import java.util.Scanner;

public class co28 {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = Sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an Alphabet");
        } else {
            System.out.println(ch + " is NOT an Alphabet");
        }

        Sc.close();
    }
}
