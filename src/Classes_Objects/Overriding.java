/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Objects;

/**
 *
 * @author Pranay
 */
public class Overriding {
    void show()
    {
        System.out.println("Show in Overriding");
    }
}
class Overriding2
{
    void show()
    {
        System.out.println("Show in Overriding2");
    }
}
class TestOver
{
    public static void main(String args[])
    {
        Overriding O1=new Overriding();
        Overriding2 O2=new Overriding2();
        O1.show();
        O2.show();
    }
}
