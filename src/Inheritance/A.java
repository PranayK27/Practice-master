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
public class A {
    int a,b,c;
    void show()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
class B extends A
{
    void getData(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
}
class AB
{
    public static void main(String args[])
    {
        B b1=new B();
        B b2=new B();
        b1.getData(10, 20, 30);
        b2.getData(100, 200, 300);
        b1.show();
        b2.show();
    }
}
