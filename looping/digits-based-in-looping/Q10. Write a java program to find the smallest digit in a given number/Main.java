import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 0) number = -number;
        int min = 9;
        while(number > 0){
            int digit = number % 10;
            if(digit < min) min = digit;
            number /= 10;
        }
        System.out.println(min);
        sc.close();
    }
}
