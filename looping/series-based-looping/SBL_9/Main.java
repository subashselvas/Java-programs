import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int es=0;
		int os=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			if(i%2==0)
			{
				es=es+i;

			}else{
				os=os+i;
			}

		}
		System.out.print(es);
		System.out.print(os);
	}
}
