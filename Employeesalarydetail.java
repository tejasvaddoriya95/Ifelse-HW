import java.util.Scanner;
public class Employeesalarydetail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee name");
        String name = scanner.nextLine();
        System.out.println("Enter Employee id");
        int id = scanner.nextInt();
        System.out.println("Basic salary");
        double salary = scanner.nextDouble();
        double hra = salary*0.10;
        System.out.println("HRA = "+hra);
        double da = salary*0.08;
        System.out.println("DA = "+da);
        double ta = salary*0.09;
        System.out.println("TA = "+ta);
        double pf = salary*0.20;
        System.out.println("PF = "+pf);
        double gross = hra+da+ta+pf;
        System.out.println("Gross salary:"+gross);
    }

}
