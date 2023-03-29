import java.util.Scanner;
public class UppercasetoLowercase {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet in Uppercase");
        String alphabet = scanner.nextLine();
        System.out.println("alphabet in lowercase:");
        System.out.println(alphabet.toLowerCase());

    }
}
