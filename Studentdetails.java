import java.util.Scanner;
public class Studentdetails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:"+"\n"+"Roll Number:"+"\n"+"Sci marks"+"\n"+"Maths marks"+"\n"+"Hindi marks");
        String name = scanner.nextLine();
        int RollNumber = scanner.nextInt();
        int scimarks =scanner.nextInt();
        int mathsmarks =scanner.nextInt();
        int hindimarks =scanner.nextInt();
        int totalmarks = (scimarks+mathsmarks+hindimarks); //calculate the totalmarks

        double percentage;
        percentage = ((totalmarks/3));   //calculation of percentage
        System.out.println("totalmarks of three subject is:"+ totalmarks);
        System.out.println("percentage of three subject is:"+ percentage);
// condition for grade allocation
        if (percentage>=80) {
            System.out.println("Your Grade is A+");
        } else if (percentage>=60) {
            System.out.println("Your Grade is A");
        } else if (percentage>=50) {
            System.out.println("Yoar Grade is B");
        } else if (percentage>=35) {
            System.out.println("Yoar Grade is C");
        } else {
            System.out.println("Fail");

        }

    }

    }






