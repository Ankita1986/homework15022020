package homework1502;

public class Exercise3 {
    //one instance and one static variables declaration
    int a =10;
    static int b = 20;
    //Instance method
    public void addition(){
        System.out.println("addition of a and b =" +(a + Exercise3.b));


    }
    // Static method
    public static void subtraction(){
        //Object creation for Instance variable access
        Exercise3 obj = new Exercise3();
        System.out.println("subtraction of a and b =" +(obj.a-b));

    }
    //Main Method Declaration
    public static void main(String[]args){
        //Object creation for calling Instance method in main
        Exercise3 obj = new Exercise3();
        obj.addition();
        //Calling static method
        subtraction();


    }
}
