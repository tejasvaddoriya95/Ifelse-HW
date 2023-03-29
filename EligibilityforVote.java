import java.util.Scanner;
public class EligibilityforVote {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");

        int age = scanner.nextInt();

        if (age>=18) {
            System.out.println("Eligible for Vote");
        } else {
            System.out.println("Not eligible for vote");
        }

    }
}
