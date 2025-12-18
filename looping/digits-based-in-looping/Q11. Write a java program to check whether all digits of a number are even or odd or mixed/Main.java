import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 0) number = -number;
        boolean even = true, odd = true;
        while(number > 0){
            int digit = number % 10;
            if(digit % 2 == 0) odd = false; else even = false;
            number /= 10;
        }
        System.out.println(even ? "Even" : odd ? "Odd" : "Mixed");
        sc.close();
    }
}
