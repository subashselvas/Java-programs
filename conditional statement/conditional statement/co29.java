import java.util.Scanner;

public class co29 {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter a digits: ");
        char ch = Sc.next().charAt(0);

        if ((ch >= '0' && ch <= '9')) {
            System.out.println(ch + " is an digits");
        } else {
            System.out.println(ch + " is NOT an digits");
        }
        Sc.close();
    }
}
