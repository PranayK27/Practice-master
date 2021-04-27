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
class A1 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=2;i++)
        {
             System.out.println(Thread.currentThread().getName());
        }
    }
}
public class ThreadRunnableInterface {
    public static void main(String args[])
    {        
            A1 a=new A1();
            
            Thread t1=new Thread(a,"Pranay");
            Thread t2=new Thread(a,"Pravin");
            Thread t3=new Thread(a,"Kekre");
            
            
            t1.start();
            t2.start();
            t3.start();
            
            System.out.println("Hello!!!!");
    }
}
