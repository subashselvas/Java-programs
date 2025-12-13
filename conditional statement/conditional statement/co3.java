import java.util.Scanner;
public class co3
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if((a&1)==0)
        {
            System.out.println("even");
        }
        else{
            System.err.println("odd");
        }
        
    }

}
