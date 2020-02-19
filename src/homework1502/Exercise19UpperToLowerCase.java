package homework1502;

import java.util.Scanner;

public class Exercise19UpperToLowerCase {
    public static void main(String[] args) {
        String i, result;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input String in Upper Case here: ");
        i = s1.nextLine();
        result = i.toLowerCase();
        System.out.println("The Conversion in Lower Case is here: " + result);

    }
}
