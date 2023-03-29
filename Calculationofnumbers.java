import java.util.Scanner;
public class Calculationofnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("Enter any operator [1] multiplication [2] addition [3] subtraction [4] division ");

        int symbol = scanner.nextInt();

        if (symbol == 1) {
            System.out.println("Multiplication: " +(a * b));
        } else if (symbol == 2) {
            System.out.println("Addition: " +(a + b));
        } else if (symbol == 3) {
            System.out.println("Subtraction: " +(a - b));

        } else if (symbol == 4) {
            System.out.println("Divison: " +(a / b));

        }
    }
}
