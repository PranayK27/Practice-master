/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author Pranay
 */
public class Final_Method {
    final void show()
    {
        System.out.println("Show in class named: Final_Method");
    }
}
class Final_Method_1 //extends Final_Method will not work as the overriding is not possible while inheriting
{
    void show()
    {
        System.out.println("Show in class named: Final_Method_1");
    }
}
class Main_Method
{
    public static void main(String args[])
    {
        Final_Method fm=new Final_Method();
        Final_Method_1 fm1=new Final_Method_1();
        fm.show();
        fm1.show();
    }
}
