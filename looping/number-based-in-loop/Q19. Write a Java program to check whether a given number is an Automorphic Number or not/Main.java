import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int square = number * number;
        int temp = number;
        int digits = 1;
        while (temp >= 10) {
            temp /= 10;
            digits *= 10;
        }
        digits *= 10;
        if (square % digits == number) {
            System.out.println(number + " is an Automorphic Number.");
        } else {
            System.out.println(number + " is not an Automorphic Number.");
        }
    }
}
