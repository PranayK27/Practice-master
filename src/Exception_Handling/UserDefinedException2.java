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
class NegativeNumberException extends Exception
{
    private double num;
    NegativeNumberException(double n)
    {
        num=n;
    }
    public String toString()
    {
        return "Square root of: "+num+" is not possible.";
    }
}

public class UserDefinedException2 {
        static void numberRoot(double n) throws NegativeNumberException
        {
        System.out.println("Checking Number: ("+n+")");
        if(n<0)
            throw new NegativeNumberException(n);
        double r=Math.sqrt(n);
        System.out.println("Square Root of: "+n+" is "+r+".");
        }
    public static void main(String args[])
    {
        try
        {
            numberRoot(25);
            numberRoot(-5);
        }
        catch(NegativeNumberException e)
        {
            System.out.println("Caught: "+e);
        }
    }

}
