package homework1502;

import java.util.Scanner;

public class Exercise14AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        double width, height, area, perimeter;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Width Of Rectangle:");
        width = s1.nextDouble();
        System.out.println("Enter Height Of Rectangle:");
        height = s1.nextDouble();
        //Area of rectangle = width * height
        area =  width * height;
        //Perimeter of rectangle = 2*(width + height)
        perimeter = 2 * (width + height);
        System.out.println("Area Of Rectangle:" + area);
        System.out.println("Perimeter Of Rectangle:"+ perimeter);



    }
}
