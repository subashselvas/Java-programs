
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        int n = marks / 10;
        switch(n) {
            case 10,9: 
            System.out.println("A Grade"); 
            break;
            case 8: System.out.println("B Grade"); 
            break;
            case 7,6: System.out.println("C Grade");
             break;
            default: System.out.println("Fail");
        }
    }
}