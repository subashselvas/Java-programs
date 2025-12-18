import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int zeros = 0, ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
            else if (c == '1') ones++;
        }
        System.out.println("0s: " + zeros);
        System.out.println("1s: " + ones);
        sc.close();
    }
}
