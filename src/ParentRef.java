/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranay
 */
public class ParentRef {
    void show()
    {
        System.out.println("Show in ParentRef");
    }
}
class ParentRef2 extends ParentRef
{
    void display()
    {
        System.out.println("Display in ParentRef2");
    }
}
class Main3
{
    public static void main(String args[])
    {
        ParentRef a1;// reference of parent class
        ParentRef2 b1=new ParentRef2();
        a1=b1;//parent class reference can hold the object of child class
        a1.show();
        b1.show();
        b1.display();
        //a1.display(); can give error coz parent class reference cannot call child class method
    }
}
