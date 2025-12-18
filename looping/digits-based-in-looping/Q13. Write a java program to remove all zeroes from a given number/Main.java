import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean negative = number < 0;
        if(negative) number = -number;
        int result = 0, place = 1;
        while(number > 0){
            int digit = number % 10;
            if(digit != 0){ result += digit * place; place *= 10; }
            number /= 10;
        }
        if(negative) result = -result;
        System.out.println(result);
        sc.close();
    }
}
