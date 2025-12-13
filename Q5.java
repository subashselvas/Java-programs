import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid Month");
        }
        else if (month == 2) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                System.out.println("Days = 29");
            else
                System.out.println("Days = 28");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Days = 30");
        }
        else {
            System.out.println("Days = 31");
        }
    }
}