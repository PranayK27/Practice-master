/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multi_Threading;

/**
 *
 * @author Pranay
 */
class A extends Thread
{
    public A(String s)
    {
        super(s);
    }
    public void run()
    {
        for(int i=1;i<=2;i++)
        {
            System.out.println(getName());
        }
    }
}
public class CreateThread {
    public static void main(String args[])
    {
        A a1=new A("Pranay");
        A a2=new A("Pravin");
        A a3=new A("Kekre");
        
        a1.start();
        a2.start();
        a3.start();
        
        System.out.println("Hello!!!!!!!");
    }
}
