package homework1502;

public class Exercise1 {
    // 2 Instance Variable Declaration
    int a=10;
    int b=20;
    // Instance Method Declaration
    public void addition(){
        System.out.print("addition of a and b =" + (a +b));

    }
    // Main Method Declaration

    public static void main(String[] args) {
        // Object Creation for Calling Instance Method in Main
        Exercise1 obj = new Exercise1();
        // Using Object to Call Method Addition
        obj.addition();



    }
}
