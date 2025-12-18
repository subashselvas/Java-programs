import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit = sc.nextInt();
        if(number < 0) number = -number;
        int count = 0;
        while(number > 0){
            if(number % 10 == digit) count++;
            number /= 10;
        }
        System.out.println(count);
        sc.close();
    }
}
