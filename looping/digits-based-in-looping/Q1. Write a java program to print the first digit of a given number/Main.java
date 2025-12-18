import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            number = -number;
        }
        while (number >= 10) {
            number = number / 10;
        }
        System.out.println("The first digit is: " + number);
        sc.close();
    }
}
