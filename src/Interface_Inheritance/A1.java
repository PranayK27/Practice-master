/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_Inheritance;
//--------------------- **********HYBRID INHERITANCE********** --------------------------------------------
/**
 *
 * @author Pranay
 */
public interface A1 {
    void show();
}
interface B1 extends A1
{
    void display();
}
interface C1 extends A1
{
    void add();
}
class Hybrid implements B1,C1
{
    public void show()
    {
        System.out.println("Show in Hybrid");
    }
    public void display()
    {
        System.out.println("Display in Hybrid");
    }
    public void add()
    {
        System.out.println("Add in Hybrid");
    }
    public static void main(String args[])
    {
        Hybrid h1= new Hybrid();
        h1.show();
        h1.display();
        h1.add();
    }
}
