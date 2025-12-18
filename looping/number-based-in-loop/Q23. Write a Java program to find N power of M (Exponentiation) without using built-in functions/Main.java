import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); 
        int n = sc.nextInt(); 

        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= m;
        System.out.println("Result: " + result)
        }
}
