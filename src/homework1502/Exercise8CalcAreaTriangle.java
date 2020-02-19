package homework1502;

import java.util.Scanner;

public class Exercise8CalcAreaTriangle {
    //Instance method
    public void calcAreaOfTriangle(int h, int b){
        double result;
        //Formula for Triangle area calculation
        result = (h * b)/2;
        System.out.println("The Area Of Triangle is = " + result);
    }
    //Main method
    public static void main(String[] args) {
        int height, base;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Lets Calculate Area Of Triangle =");
        System.out.println("Please enter The Height Of Triangle =");
        height = s1.nextInt();
        System.out.println("Please enter The Base Of Triangle =");
        base = s1.nextInt();
        //Object creation for calling instance method
        Exercise8CalcAreaTriangle obj = new Exercise8CalcAreaTriangle();
        obj.calcAreaOfTriangle(height, base);
    }
}
