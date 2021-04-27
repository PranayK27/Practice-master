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
public class X {
    int a=10;
}
class Y extends X
{
    int a=20;
    void show()
    {
        int a=100;
        System.out.println(a);// shows recently assigned value
        System.out.println(this.a); // access value outside the method scope
        System.out.println(super.a); // access value of parent class
    }
}
class XY
{
    public static void main(String args[])
    {
        Y y1=new Y();
        y1.show();
    }
}