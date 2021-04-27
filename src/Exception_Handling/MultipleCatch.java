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
public class MultipleCatch {
    public static void main(String args[])
    {
        try
        {
            int a=args.length;
            System.out.println("a: "+a);
            int b=10/a;
            int c[]={1};
            c[10]=100;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divided by 0: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index oob: "+e);
        }
    }
}
