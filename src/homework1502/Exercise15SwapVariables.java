package homework1502;

import java.util.Scanner;

public class Exercise15SwapVariables {
    public static void main(String[] args) {
        // x and y are to swap
        int x, y, t;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter The Value Of X and Y:");
        x = s1.nextInt();
        y = s1.nextInt();
        System.out.println("Before swapping numbers: " + x +" "+ y);
        //swapping
        t = x;
        x = y;
        y = t;
        System.out.println("After swapping: " + x + " " + y);


    }
}
