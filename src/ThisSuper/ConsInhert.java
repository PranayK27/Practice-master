/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThisSuper;

/**
 *
 * @author Pranay
 */
public class ConsInhert {
    ConsInhert()
    {
        System.out.println("Class ConsInhert");
    }
}
class ConsInhert2 extends ConsInhert
{
    ConsInhert2()
    {
        System.out.println("Class ConsInhert2");
    }
}
class Main
{
    public static void main(String args[])
    {
        ConsInhert a1=new ConsInhert();
        ConsInhert2 b1=new ConsInhert2(); // when object of child class is created the object, it calls the parent class constructor first.
    }
}
