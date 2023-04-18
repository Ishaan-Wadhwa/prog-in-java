public class lab5q2 {
    int a = 9;

    void display() {
        System.out.println("the function of base class.");
    }

    class derived extends lab5q2 
    {

    }

    public static void main(String[] args) 
    {
        derived obj1 = new derived();
        obj1.display();
        System.out.println("the variable of the base class a : " + obj1.a);
    }
}