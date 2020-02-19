package homework1502;

import java.util.Scanner;

public class Exercise9UpperToLowerCase {
    //Main Method
    public static void main(String[] args) {
        //Accepting string value in i as user input
        String i, result;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please Enter Text in UPPER CASE =");
        i = s1.nextLine();
        //Using java Inbuilt Function to Convert upper to lower case
        result = i.toLowerCase();
        System.out.println("The Conversion in Lower Case =" + result);






        }
    }

