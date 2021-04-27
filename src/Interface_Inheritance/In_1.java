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
public interface In_1 {
void show();    
}
interface In_2{
    void display();
}
class AI implements In_1, In_2
{
    public void show()
    {
        System.out.println("Show in AI");
    }
    public void display()
    {
        System.out.println("Display in AI");
    }
}
class Main_I
{
    public static void main(String args[])
    {
        AI a1=new AI();
        a1.show();
        a1.display();
    }
}
