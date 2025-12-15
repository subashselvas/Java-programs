import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        if (day.equals("Saturday") || day.equals("Sunday"))
            System.out.println("Weekend Ticket Price");
        else
            System.out.println("Weekday Ticket Price");
    }
}
