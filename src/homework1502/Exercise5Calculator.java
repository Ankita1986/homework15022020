package homework1502;
import java.util.Scanner;

public class Exercise5Calculator {
    //Two Instance method
    public void AddInst(int a, int b){
        int result;
        result = a + b;
        System.out.println("Addition of a and b =" +result);
    }
    public void SubInst(int a, int b){
        int result;
        result = a - b;
        System.out.println("Subtraction of a and b =" +result);
    }
    //Two static method
    public static void MultiStat(int a, int b){
        int result;
        result = a*b;
        System.out.println("Multiplication of a and b =" +result);
    }
    public static void DivStat(int a, int b){
        int result;
        result = a/b;
        System.out.println("Division of a and b =" +result);
    }
    //Main Method
    public static void main(String[] args) {
        int a,b;
        //Using scanner class for user input
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter 1st Integer: a ");
        a= s1.nextInt();
        System.out.println("Enter 2nd Integer: b ");
        b= s1.nextInt();
        //Object creation for calling instance method
        Exercise5Calculator obj = new Exercise5Calculator();
        obj.AddInst(a,b);
        obj.SubInst(a,b);
        //Calling static method
        MultiStat(a,b);
        DivStat(a,b);



    }


}
