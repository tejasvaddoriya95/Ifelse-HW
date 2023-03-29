import java.util.Scanner;
public class Positive_or_Negative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        if (number>0){
            System.out.println("number is positive");
        } else if (number<0) {
            System.out.println("number is negative");

        }
        else {
            System.out.println("number is zero");
        }
    }
}
