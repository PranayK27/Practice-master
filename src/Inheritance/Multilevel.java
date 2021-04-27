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
public class Multilevel {
    void show()
    {
        System.out.println("Show in Multilevel");
    }
}
class Multilevel_1 extends Multilevel
{
    void display()
    {
        System.out.println("Display in Multilevel_1");
    }
}
class Multilevel_2 extends Multilevel_1
{
    void add()
    {
        System.out.println("Add in Multilevel_2");
    }
}
class Inheritance
{
    public static void main(String args[])
    {
        Multilevel m1=new Multilevel();
        Multilevel_1 m2=new Multilevel_1();
        Multilevel_2 m3=new Multilevel_2();
        
        m1.show();
        // ----m1.display();---- will not work
        // ----m1.add();---- will not work
        
        m2.show();
        m2.display();
        // ----m2.add();---- will not work
        
        m3.show();
        m3.display();
        m3.add();
    }
}
