import java.util.Scanner;
public class Cityname {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet from a to f");
        char letter = scanner.next().charAt(0);

        if (letter == 'a') {
            System.out.println("Amreli");

        } else if (letter == 'b') {
            System.out.println("Bagasara");

        } else if (letter == 'c') {
            System.out.println("Chalala");

        } else if (letter == 'd') {
            System.out.println("Daman");

        } else if (letter == 'e') {
            System.out.println("Engorala");

        } else if (letter == 'f') {
            System.out.println("Fareni");

        } else {
            System.out.println("Invalid Entry");
        }

    }
}
