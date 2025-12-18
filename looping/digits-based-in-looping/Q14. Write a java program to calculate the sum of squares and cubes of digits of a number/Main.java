import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 0) number = -number;
        long sumSq = 0, sumCube = 0;
        while(number > 0){
            int digit = number % 10;
            sumSq += digit * digit;
            sumCube += digit * digit * digit;
            number /= 10;
        }
        System.out.println("Sum of squares: " + sumSq);
        System.out.println("Sum of cubes: " + sumCube);
        sc.close();
    }
}
