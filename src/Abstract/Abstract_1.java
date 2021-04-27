/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Pranay
 */
abstract class Abstract_1 {
    abstract void show();
    void display()
    {
        System.out.println("Display in Abstract_1"); 
    }
    Abstract_1(int x)
    {
        System.out.println("value in constructor: "+x);
    }
}
class Abstract_2 extends Abstract_1
{
    

    public Abstract_2(int x) {
        super(10);
    }
    void show()
    {
        System.out.println("Show in Abstract_2");
    }
}
class Main_Abstract
{
    public static void main(String args[])
    {
        Abstract_1 a1=new Abstract_2(20); // can only create the refernce of abstract class, no object can be created
        a1.display();
        a1.show();
        
    }
}