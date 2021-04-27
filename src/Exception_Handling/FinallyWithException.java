/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_Handling;

/**
 *
 * @author Pranay
 */
public class FinallyWithException {
    // Throw an exception of the method
    static void procA()
    {
        try
        {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        }
        finally
        {
            System.out.println("procA's finally");
        }
    }
    //Return from within a try block
    static void procB()
    {
        try
        {
            System.out.println("Inside procB");
            return;
        }
        finally
        {
            System.out.println("procB's finally");
        }
    }
    //Execute a try block normally
    static void procC()
    {
        try
        {
            System.out.println("Inside procC");
        }
        finally
        {
            System.out.println("procC's finally");
        }
    }
    public static void main(String args[])
    {
        try
        {
            procA();
        }
        catch(Exception e)
        {
            System.out.println("Exception Caught");
        }
        procB();
        procC();
    }
}
