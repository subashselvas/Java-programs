import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] bin = new int[32];
		int i = 0;
		if (n == 0)
			System.out.println(0);
		else {
			while (n > 0) {
				bin[i++] = n % 2;
				n /= 2;
			}
			for (int j = i - 1; j >= 0; j--)
				System.out.print(bin[j]);
		}
	}
}
