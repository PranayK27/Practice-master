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
final class Final_Class {
    void show()
    {
        System.out.println("Show in Fina_Class");
    }
}
class Final_Class_1 //extends Final_Class
{
    void show()
    {
        System.out.println("Show in Final_Class_1");
    }
}
class Final_Main
{
    public static void main(String args[])
    {
        Final_Class fc=new Final_Class();
        Final_Class_1 fc1=new Final_Class_1();
        fc.show();
        fc1.show();
    }
}
