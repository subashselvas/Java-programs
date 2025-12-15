import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        if (speed > 100)
            System.out.println("Speed limit exceeded");
        else
            System.out.println("Speed within limit");
    }
}
