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
public class Throws2 {
    void div(int x, int y) throws ArithmeticException
    {
        int z;
        if(y==2)
            throw new ArithmeticException("/ by two");
        else{
            z=x/y;
            System.out.println(z);
        }
    }
    public static void main(String args[])
    {
        Throws2 t1=new Throws2();
        try
        {
            t1.div(10,2);
            t1.div(10, 0);// will throw exception and it will exit try block so next line will not get executed
            t1.div(10, 5); // this will not get executed since the exception is already being thrown to catch block as the try block is exited
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
