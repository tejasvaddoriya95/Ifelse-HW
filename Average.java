import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner.nextInt();
        System.out.println("Enter third number");
        int number3 = scanner.nextInt();
        System.out.println("Enter fourth number");
        int number4 = scanner.nextInt();
        System.out.println("Enter fifth number");
        int number5 = scanner.nextInt();

        int average = number1 + number2 + number3 + number4 + number5;
        System.out.println("Average of five number is "+average );
    }
}
