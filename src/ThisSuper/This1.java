/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThisSuper;

/**
 *
 * @author Pranay
 */
public class This1 {
    This1()
 {
   System.out.println("Default");  
 }
 This1(int x)
 {
     this();
     System.out.println(x);
 }
 This1(int a, int b)
 {
     this(a);
     System.out.println(a+" "+b);
    }
}
class This2
{
    public static void main(String args[])
    {
        This1 a1=new This1();
        This1 a2=new This1(10);
        This1 a3=new This1(10,20);
    }
}
