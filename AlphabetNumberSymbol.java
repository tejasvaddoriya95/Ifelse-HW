import java.util.Scanner;
public class AlphabetNumberSymbol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");

        char value = scanner.next().charAt(0);

        if (Character.isAlphabetic(value)) {
            System.out.println(value + "Alphabet");
        } else if (Character.isDigit(value)) {
            System.out.println(value + "Number");

        } else {
            System.out.println(value + "Symbol");
        }
    }
}
