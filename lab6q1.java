abstract class shape {
    void area() {
    }
}

class triangle extends shape {
    int height, base;
    double area;

    void area(int height, int base) {
        area = 0.5 * base * height;
        System.out.println(area);
    }
}

class rectangle extends shape {
    int length, base;
    int area;

    void area(int length, int base) {
        area = length * base;
        System.out.println(area);
    }
}

 class circle extends shape {
    double radius;
    double area;

    void area(float radius) {
        area = 3.14 * radius * radius;
        System.out.println(area);
    }
}

public class lab6q1 
{
public static void main(String args[])
{
    triangle tr = new triangle();
    tr.area(12,5);
    circle cr = new circle();
    cr.area(6);
    rectangle rc = new rectangle();
    rc.area(23,35);
}
}
