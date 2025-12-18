import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 0) number = -number;
        boolean descending = true;
        int prev = number % 10;
        number /= 10;
        while(number > 0){
            int curr = number % 10;
            if(curr < prev){ descending = false; break; }
            prev = curr;
            number /= 10;
        }
        System.out.println(descending ? "Yes" : "No");
        sc.close();
    }
}
