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
public class Thread1 {
    public static void main(String args[])
    {
        Thread t;
        t=Thread.currentThread();
        System.out.println(t);
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.setName("MyThread");
        t.setPriority(2);
        System.out.println(t);
        System.out.println(t.isAlive());
        try
        {
         for(int i=1;i<=5;i++)
         {
             System.out.println(i);
             t.sleep(1000);
         }
        }
        catch(InterruptedException e)
        {
         System.out.println(e);
        }
        }
    }

