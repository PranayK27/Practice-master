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
public class NamePriority {
    public static void main(String args[])
    {
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        System.out.println("Priority: "+Thread.currentThread().getPriority());
    }
}
