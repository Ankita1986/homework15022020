package homework1502;

import java.util.Scanner;

public class Exercise17DecimalToBinary {
    public static void main(String[] args) {
        int num;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a  Decimal Number:");
        num = s1.nextInt();
        // without using inbuilt function
        int [] rem = new int[25];
        int index = 0;
        while (num > 0){
            rem [index] = num % 2;
            index++;
            num = num/2;
        }
        System.out.print("The Binary Number is: " );

        for (int i = (index-1); i >=0; i--){
            System.out.print(rem[i]);

        }
    }
}
