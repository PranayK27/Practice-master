/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_Handling;
//import java.lang.ArithmeticException;
/**
 *
 * @author Pranay
 */
public class E1 {
    public static void main(String args[])
    {
        int a=10,b=10,c,d[]={1,2,3};
        try{
        c=a/b;
        System.out.println(c);
        System.out.println(d[4]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("dont divide by zero");
        }
        //try{
          //  System.out.println(d[4]);
        //}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index of array");
        }
        System.out.println("Hello");
    }
}
