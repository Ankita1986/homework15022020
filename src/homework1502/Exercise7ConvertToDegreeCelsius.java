package homework1502;

import java.util.Scanner;


public class Exercise7ConvertToDegreeCelsius {
    //Instance method
    public void calcFahrenToDegree(double i){
        double result;
        //Formula for converting F to C
        result = (i-32)*5/9;
        System.out.println("The Celsius Value is =" + result);

    }
    //Main method
    public static void main(String[] args) {
        double a;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Fahrenheit Temperature Range between -60 to 120°F");
        System.out.println("Please Enter Fahrenheit Value Here =");
        a=s1.nextDouble();
        //Object creation for calling instance method
        Exercise7ConvertToDegreeCelsius obj = new Exercise7ConvertToDegreeCelsius();
        obj.calcFahrenToDegree(a);

    }
    }

