/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Pranay
 */
public class S1 {
  void show()
  {
      System.out.println("Show in S1");
  }
}
class S2 extends S1
{
    void display()
    {
        System.out.println("Display in S2");
    }
}
class Test
{
    public static void main(String args[])
    {
        S1 s1=new S1();
        S2 s2=new S2();
        s1.show();
        s2.show();
        s2.display();
    }
}