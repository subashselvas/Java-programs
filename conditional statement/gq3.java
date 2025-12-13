import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0)
            System.out.println("First Quadrant");
        else if (x < 0 && y > 0)
            System.out.println("Second Quadrant");
        else if (x < 0 && y < 0)
            System.out.println("Third Quadrant");
        else if (x > 0 && y < 0)
            System.out.println("Fourth Quadrant");
        else  (x == 0 && y == 0)
            System.out.println("Origin");
       
    }
}
