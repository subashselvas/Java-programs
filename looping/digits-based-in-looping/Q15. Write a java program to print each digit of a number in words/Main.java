import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean negative = number < 0;
        if(negative) number = -number;
        if(number == 0){ System.out.println("Zero"); return; }
        
        int rev = 0;
        int n = number;
        while(n > 0){ rev = rev * 10 + n % 10; n /= 10; }
        
        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if(negative) System.out.print("Minus ");
        while(rev > 0){
            System.out.print(words[rev % 10] + " ");
            rev /= 10;
        }
        sc.close();
    }
}
