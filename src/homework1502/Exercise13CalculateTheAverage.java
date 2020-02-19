package homework1502;

import java.util.Scanner;

public class Exercise13CalculateTheAverage {
    public static void main(String[] args) {
        int a, b, c, result;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input 1st Number:");
        a = s1.nextInt();
        System.out.println("Input 2nd Number:");
        b = s1.nextInt();
        System.out.println("Input 3rd Number:");
        c = s1.nextInt();
        result = ((a+b+c)/ 3);
        System.out.println("Average Of Three Number is =" +result);



    }
}
