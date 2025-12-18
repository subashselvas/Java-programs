import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 0) number = -number;
        int first = number;
        while(first >= 10) first /= 10;
        System.out.println(first % 2 == 0 ? "Even" : "Odd");
        sc.close();
    }
}
