import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm;
        int max = (num1 > num2) ? num1 : num2;
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                lcm = max;
                break;
            }
            max++;
        }
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
