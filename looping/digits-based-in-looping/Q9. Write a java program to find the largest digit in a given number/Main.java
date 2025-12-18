import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 0) number = -number;
        int max = 0;
        while(number > 0){
            int digit = number % 10;
            if(digit > max) max = digit;
            number /= 10;
        }
        System.out.println(max);
        sc.close();
    }
}
