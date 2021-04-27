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
public interface NewInterface_1 {
void show();
}
class A_Interface implements NewInterface_1
{
    public void show()
    {
        System.out.println("Show in A");
    }
}
class Main_Interface
{
    public static void main(String args[])
    {
      A_Interface a1=new A_Interface();
      a1.show();
    }
}
