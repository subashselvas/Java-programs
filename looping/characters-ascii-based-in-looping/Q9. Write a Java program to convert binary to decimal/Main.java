import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        int decimal = 0;
        int power = 1; 
        for (int i = binary.length() - 1; i >= 0; i--) {
            char c = binary.charAt(i);
            if (c == '1') decimal += power;
            else if (c != '0') {
                System.out.println("Invalid binary number!");
                sc.close();
                return;
            }
            power *= 2;
        }
        System.out.println("Decimal: " + decimal);
        }
}
