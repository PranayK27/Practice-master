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
public class Finally_block {
    public static void main(String args[])
    {
        int a=10, b=10, c, d[]={1,2,3};
        try
        {
            c=a/b;
            System.out.println(c);
            System.out.println(d[3]);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Hello");
        }
    }
}
