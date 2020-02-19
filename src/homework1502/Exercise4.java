package homework1502;

public class Exercise4 {
    //Two Instance and Two Static variable declaration
    int a = 10;
    int b = 20;
    static int c = 30;
    static int d = 40;
    //Instance method
    public void addition() {
        System.out.println("addition of a and b =" + (a + b));
        System.out.println("addition of c and d =" + (Exercise4.c + Exercise4.d));
    }
    //Static method
    public static void addition1() {
        //Object creation for Instance variable access
        Exercise4 obj = new Exercise4();
        System.out.println("addition1 of a and b =" + (obj.a + obj.b));
        System.out.println("addition1 of c and d =" + (c + d));

    }
    //Main Method
    public static void main(String[] args) {
        //Object creation for calling Instance method
        Exercise4 obj = new Exercise4();
        obj.addition();
        //Calling static method
        addition1();

    }
}
