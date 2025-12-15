import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        int discount = 0;
        if (bill < 1000) {
            discount = 0;
        }
        else if (bill < 5000) {
            discount = bill * 10 / 100;
        }
        else {
            discount = bill * 20 / 100;
        }
        int finalAmount = bill - discount;
        System.out.println(discount);
        System.out.println(finalAmount);
    }
}
