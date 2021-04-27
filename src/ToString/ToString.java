/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToString;

/**
 *
 * @author Pranay
 */
public class ToString {
    String str;
    ToString(String Temp)
    {
        str=Temp;
    }
    public String toString()
    {
        return(str);
    }
    public static void main(String args[])
    {
        ToString t1=new ToString("Hello");
        System.out.println(t1);
        ToString t2=new ToString("Pranay");
        System.out.println(t2);
    }
}
