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
public class ExceptionHierarchy {
    public static void main(String args[])
    {
        try{
            int a=0;
            int b=10/a;
        }
        catch(Exception e)
        {
            System.out.println("Generic Exception catch.");
        }
        /*catch(ArithmeticException e)
        {// ERROR ? unreachable code
            System.out.println("This is never reached.");
        }*/
    }
}
