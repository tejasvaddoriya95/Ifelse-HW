import java.util.Scanner;
public class Studentresult {
    Scanner scanner = new Scanner(System.in);



    //student will be pass if he-she get 35+ marks

      public void main(String[] args) {

        System.out.println("student name:"+"\n"+"roll number:"+"\n"+"sci marks:"+"\n"+"math marks"+"\n"+"hindi marks");
        int scimarks = scanner.nextInt();
        int mathmarks = scanner.nextInt();
        int hindimarks = scanner.nextInt();

        if (((scimarks >= 35) && (mathmarks >=35) && (hindimarks>= 35))) {

            System.out.println("you are pass");

        } else {
            System.out.println("you are fail");
        }


    }
}
