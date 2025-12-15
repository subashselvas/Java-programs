import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    int d=sc.nextInt();
	    if(a==b && b==c && c==d && a==d){
	        System.out.println("it is square");
	    }
	    else{
	        System.out.println("it is rectangle");
	    }
	}
}
