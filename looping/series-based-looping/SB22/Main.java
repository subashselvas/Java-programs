import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//37

        for (int num = 1; num <= N; num++) {
            if (num % 7 == 0 || num % 10 == 7) {
                System.out.println(num);
            }
        }
    }
}
