import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit = sc.nextInt();
        if(number < 0) number = -number;
        boolean found = false;
        while(number > 0){
            if(number % 10 == digit) found = true;
            number /= 10;
        }
        System.out.println(found ? "Yes" : "No");
        sc.close();
    }
}
