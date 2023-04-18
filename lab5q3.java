//WAP TO ILLUSTRATE MULTILEVEL INHERITANCE
public class lab5q3 {
    void Text() {
        System.out.println("Main class");
    }

    static class derived1 extends lab5q3 {
        void display() {
            System.out.println("first derived class.");
        }
    }

    static class derived2 extends derived1 
    {
        void show() {
            System.out.println("second derived class.");
        }
    }

    static class derived3 extends derived2 
    {
        void Show() {
            System.out.println("third derived class.");
        }
    }

    public static void main(String[] args) {
        derived3 obj1 = new derived3();
        System.out.println("the method of base class inherited by the third class's object.");
        obj1.Text();
        System.out.println("the method of the first derived class inherited by the third class's object.");
        obj1.display();
        System.out.println("the method of the second derived class inherited by the third class's object.");
        obj1.show();
        System.out.println("the method of the third derived class.");
        obj1.Show();
    }
}