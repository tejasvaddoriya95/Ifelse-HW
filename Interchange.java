import java.util.Scanner;
public class Interchange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of A and B");
//A and B are to interchanged
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C;
        System.out.println("before changing value:"+ A + " "+ B);
//interchanging numbers
        C = A;
        A = B;
        B = C;

        System.out.println("after changing:"+ A + " "+B);

    }
}
