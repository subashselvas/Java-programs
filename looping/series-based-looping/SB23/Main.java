import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int num = 1; num <= N; num++) {
			int temp = num;

			while (temp > 9) {
				int sum = 0;

				while (temp > 0) {
					sum = sum + (temp % 10);
					temp = temp / 10;
				}

				temp = sum;
			}

			if (temp == 1) {
				System.out.println(num);
			}
		}
	}
}