import java.util.Scanner;
public class SalesCommission {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sellers name");
        String name = scanner.nextLine();
        System.out.println("Sales id");
        int id = scanner.nextInt();
        System.out.println("Sales amount");
        double amount = scanner.nextDouble();
        System.out.println("Basic salary");
        double salary = scanner.nextDouble();

        if (amount>=50000){
            System.out.println("commission is "+(amount*0.35));
        } else if (amount>=30000) {
            System.out.println("commission is "+(amount*0.20));

        } else if (amount>=20000) {
            System.out.println("commission is "+(amount*0.10));

        } else if (amount>=10000) {
            System.out.println("commission is "+(amount*0.05));

        }
        System.out.println("");
    }
}
