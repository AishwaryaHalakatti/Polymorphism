
package Methodoverloading;


public class Methodoverloading {
    int add(int a, int b)
  {
    int sum = a+b;
    return sum;
  }
  //adding three integer numbers
  int add(int a, int b, int c)
  {
    int sum = a+b+c;
    return sum;
  }
}
class Main
{
  public static void main(String args[])
  {
    Methodoverloading obj = new Methodoverloading();
    System.out.println(obj.add(10, 20));
    System.out.println(obj.add(10, 20, 30));
  }
}

