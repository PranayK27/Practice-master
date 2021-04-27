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
public interface I_1 {
     void show();
}

interface I_2{
    
    void display();
    
}
class A_I
{
    public void show()
    {
        System.out.println("Show in A_I");
    }
}
class B_I extends A_I implements I_1, I_2
{
    public void display()
    {
        System.out.println("Display in B_I");
    }
}
class Test_I
{
    public static void main(String args[])
    {
        B_I b1=new B_I();
        b1.show();
        b1.display();
    }
}
