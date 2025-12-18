import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
 		int n = num;
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			int fact = 1;
			for (int i = 1; i <= digit; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;
		}
		if (sum == num) {
			System.out.println(num + " is a Strong Number");
		} else {
			System.out.println(num + " is not a Strong Number");

		}
	}
}