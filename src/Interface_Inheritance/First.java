/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_Inheritance;

/**
 *
 * @author Pranay
 */
public interface First {
    void show();
}
interface Second extends First{
    void display();
}
class Test_In implements Second
{
    public void show()
    {
        System.out.println("Show in Test");
    }
    public void display()
    {
        System.out.println("Display in Test");
    }
    public static void main(String args[])
    {
        Test_In t1=new Test_In();
        t1.show();
        t1.display();
    }
}
