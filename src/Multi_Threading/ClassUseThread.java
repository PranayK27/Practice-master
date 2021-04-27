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

class A11 extends Thread
{
    public void run()
    {
        for(int i=1;i<=2;i++)
        {
            System.out.println("Pranay");
        }
    }
}
class B11 extends Thread
{
    public void run()
    {
        for(int i=1;i<=2;i++)
        {
            System.out.println("Purva");
        }
    }
}
class C11 extends Thread
{
    public void run()
    {
        for(int i=1;i<=2;i++)
        {
            System.out.println("Prasanna");
        }
    }
}
public class ClassUseThread {
    public static void main(String args[])
    {
        System.out.println(" Kekre Knights");
        
        A11 a=new A11();
        B11 b=new B11();
        C11 c=new C11();
        
        a.start();
        b.start();
        c.start();
        
        System.out.println(" We Will We will Rock you........");
    }
}
