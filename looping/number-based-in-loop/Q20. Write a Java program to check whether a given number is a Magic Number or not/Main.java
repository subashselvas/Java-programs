import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = number;
        while (sum > 9) {
            int temp = sum;
            sum = 0;
            while (temp != 0) {
                sum += temp % 10;  
                temp /= 10;        
            }
        }
        if (sum == 1) {
            System.out.println(number + " is a Magic Number.");
        } else {
            System.out.println(number + " is not a Magic Number.");
        }

    }
}
