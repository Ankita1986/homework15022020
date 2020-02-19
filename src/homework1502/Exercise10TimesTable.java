package homework1502;

import java.util.Scanner;

public class Exercise10TimesTable {
    //Main Method
    public static void main(String[] args) {
        int num;
        //Receive table number from user
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please Enter an Integer = ");
        num = s1.nextInt();
        System.out.println("Time Table of "+num+" is =");
        //using for loop for 10 iteration
        for (int i = 0; i < 10;i++){
            System.out.println(num + "*" +(i+1) +"=" + (num *(i+1)));

        }
    }
}
