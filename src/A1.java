/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranay
 */
public class A1 {
    void show()
    {
        System.out.println("Show in A1");
    }
}
class B1 extends A1
{
    void show()
    {
        System.out.println("Show in B1");
    }
}
class C1 extends A1
{
    void show()
    {
        System.out.println("Show in C1");
    }
}
class Multiple
{
    public static void main(String args[])
    {
        A1 a1;
        B1 b1=new B1();
        a1=b1;
        a1.show();
        C1 c1=new C1();
        a1=c1;
        a1.show();
    }
}
