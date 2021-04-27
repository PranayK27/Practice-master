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
import java.util.Random;
public class TryCatchBlock2 {
    public static void main(String args[])
    {
        int a=0,b=0,c=0;
        Random r=new Random();
        for(int i=1;i<=20;i++)
        {
            try
            {
                b=r.nextInt();
                c=r.nextInt();
                a=12345/(b/c);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Division by Zero.");
                a=0;// Set a to zero and continue.
            }
            System.out.println("a: "+a);
        }
    }
}
