public class Lab4q1
{
  public static class box
  {
    int length,breadth,height;
  box(int l , int b , int h)
    {
      length = l;
      breadth = b;
      height = h;
    }
    void volume()
    {
      System.out.println("the volume of the box is "+(length*breadth*height));
    }
  }
  public static void main(String args[])
  {
    box b1 = new box(1,2,3);
    b1.volume();
  }
}