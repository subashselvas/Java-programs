
import java.util.Scanner;

public class q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hex = sc.next();               
        int value = Integer.parseInt(hex, 16); 

        System.out.println("int: " + value);
    }
}
