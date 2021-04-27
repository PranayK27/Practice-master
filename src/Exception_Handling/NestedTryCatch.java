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
public class NestedTryCatch {
    public static void main(String args[])
    {
        try
        {
            int a=args.length;
            int b=10/a;
            System.out.println("a= "+a);
            try
            {
                if(a==1)
                    a=a/(a-a);
                if(a==2)
                {
                    int c[]={1};
                    c[10]=100;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array Index out-of-bounds: "+e);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by 0: "+e);
        }
    }
}
