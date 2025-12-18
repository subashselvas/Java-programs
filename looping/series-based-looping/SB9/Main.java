import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int es=0;
	    int os=0;
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++){
	        if(i%2==0){
	            es=es+i;
	            
	        }else{
	            os=os+i;
	        }
	       
	   
	    }
	     System.out.println(es);
	     System.out.println(os);
	
	}
}