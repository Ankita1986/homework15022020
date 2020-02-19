package homework1502;

import java.util.Scanner;

public class Exercise16AddTwoBinary {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        //Accepting to binary values from user
        System.out.println("Enter 1st Binary Number:");
        String i= s1.next();
        System.out.println("Enter 2nd Binary Number ");
        String j= s1.next();
        // Converting 2 binary string into 2 Integer values

        int n1 = Integer.parseInt(i, 2);
        int n2 = Integer.parseInt(j, 2);
        int n3 = n1 + n2;
        //Converting integers to binary values
        System.out.println("n1: " + Integer.toBinaryString(n1));
        System.out.println("n2: " + Integer.toBinaryString(n2));
        System.out.println("n3=n1+n2: " + Integer.toBinaryString(n3));
    }
}
