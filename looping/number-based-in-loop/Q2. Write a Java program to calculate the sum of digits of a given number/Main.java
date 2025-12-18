import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int temp = number; 
        while (temp != 0) {
            sum += temp % 10; 
            temp /= 10;       
        }
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}
