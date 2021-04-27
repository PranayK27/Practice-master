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
public class TryCatchBlock {
    public static void main(String args[])
    {
        int d,a;
        try
        {
        d=0;
        a=10/d;
        System.out.println("This will not be printed.");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero.");
        }
        System.out.println("After Catch Statement.");
    }
}
