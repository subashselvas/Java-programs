
import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String octal = sc.next();               
        int value = Integer.parseInt(octal, 8); 

        System.out.println("int: " + value);
    }
}