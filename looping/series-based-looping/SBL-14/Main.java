import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        int n = sc.nextInt(); 

        while (count < n) {
            int num = sc.nextInt();

            if (num < 0) {
                continue; 
            }

            sum += num;
            count++;
        }

        System.out.println(sum);
        sc.close();
    }
}
