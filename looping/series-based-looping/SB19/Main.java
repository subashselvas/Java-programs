import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//N=6

        for (int num = 1; num <= N; num++) {//for(int num=1;1<=6;num++)
            int sum = 0;

            for (int i = 1; i < num; i++) {//
                if (num % i == 0) {
                    sum = sum + i;
                }
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
