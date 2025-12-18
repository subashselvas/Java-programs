import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = number < 0 ? -number : number;
        int last = n % 10;
        int first = n;
        int digits = 0;
        while(first >= 10){ first /= 10; digits++; }
        int swapped = last * (int)Math.pow(10, digits) + (n % (int)Math.pow(10, digits)) - last + first;
        if(number < 0) swapped = -swapped;
        System.out.println(swapped);
        sc.close();
    }
}
