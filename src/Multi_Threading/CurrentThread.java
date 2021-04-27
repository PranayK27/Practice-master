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
public class CurrentThread {
    public static void main(String args[])
    {
        Thread t=Thread.currentThread();
        System.out.println("Current Thread is: "+t);
        
        t.setName("My Thread");
        System.out.println("After Changing Name is= "+t);
    }
}
