import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 0) number = -number;
        int sumEven = 0, sumOdd = 0;
        while(number > 0){
            int digit = number % 10;
            if(digit % 2 == 0) sumEven += digit; else sumOdd += digit;
            number /= 10;
        }
        System.out.println(sumEven - sumOdd);
        sc.close();
    }
}
