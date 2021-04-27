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
public class ChainedException {
    static void demoprac()
    {
        NullPointerException e=new NullPointerException("top layer");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }
    public static void main(String args[])
    {
        try
        {
            demoprac();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught: "+e);
            System.out.println("Original cause: "+e.getCause());
        }
    }
}
