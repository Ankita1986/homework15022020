package homework1502;
import java.util.Scanner;

public class Exercise6CalcAreaCircle {
    //Instance method
    public void calcAreaOfCircle(int i){
        //Double variable declaration
        double result;
       result = 3.14 * i * i;
        System.out.println("The Area Of Circle is =" + result);
    }
    //Main method
    public static void main(String[] args) {
        int a;
        //Scanner class for user input
        Scanner s1 = new Scanner(System.in);
        System.out.println("Lets Calculate Area Of Circle =");
        System.out.println("Please Enter The Radius Of Circle in Integer =");
        a= s1.nextInt();
        //Object declaration for instance method access
        Exercise6CalcAreaCircle obj = new Exercise6CalcAreaCircle();
        obj.calcAreaOfCircle(a);

    }
}
