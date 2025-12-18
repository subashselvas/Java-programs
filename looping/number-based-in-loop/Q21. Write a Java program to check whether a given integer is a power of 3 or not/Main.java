import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println("Not a Power of 3");
        } else {
            while (num % 3 == 0)
                num /= 3;
            if (num == 1)
                System.out.println("Power of 3");
            else
                System.out.println("Not a Power of 3");
        }
    }
}
