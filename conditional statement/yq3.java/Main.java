import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int firstTwo = year / 100;
        int lastTwo = year % 100;
        if (firstTwo == lastTwo) {
            System.out.println(year + " has equal first two and last two digits.");
        } else {
            System.out.println(year + " does NOT have equal first two and last two digits.");
        }
    }
}
