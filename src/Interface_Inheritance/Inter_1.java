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
public interface Inter_1 {
    void show();
}
interface Inter_2{
    
    void display();
    
}
class A_Inter
{
    public void add()
    {
        System.out.println("add in A_Inter");
    }
}
class B_Inter extends A_Inter implements Inter_1, Inter_2
{
    public void show()
    {
        System.out.println("Show in B_Inter");
    }
    public void display()
    {
        System.out.println("Display in b_Inter");
    }
}
class Test
{
    public static void main(String args[])
    {
        B_Inter b1=new B_Inter();
        b1.show();
        b1.display();
        b1.add();
    }
}

