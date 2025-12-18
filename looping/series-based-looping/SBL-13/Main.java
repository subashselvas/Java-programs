import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;

        while (true) {
            n = sc.nextInt();
            if (n < 0) {
                break;
            } else {
                sum = sum + n;
            }
        }

        System.out.println(sum); 
    }
}
