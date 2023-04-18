interface Shape 
{
 double area();
}
class Rectangle implements Shape {
 double length;
 double width;
 Rectangle(double length, double width) {
 this.length = length;
 this.width = width;
 }
 public double area() {
 return length * width;
 }
}
class Triangle implements Shape {
 double base;
 double height;
 Triangle(double base, double height) {
 this.base = base;
 this.height = height;
 }
 public double area() {
 return 0.5 * base * height;
 }
}
public class lab6q2 {
 public static void main(String[] args) {
 Shape s1 = new Rectangle(5, 10);
 Shape s2 = new Triangle(8, 12);
 System.out.println("Area of rectangle: " + s1.area());
 System.out.println("Area of triangle: " + s2.area());
 }
}
