/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Objects;

/**
 *
 * @author Pranay
 */
public class Return_By_Value {
    int add(int a, int b)
    {
        int c;
        c=a+b;
        return(c);
    }
    public static void main(String args[])
    {
        Return_By_Value t1=new Return_By_Value();
        int x;
        x=t1.add(10,20);
        System.out.println(x);
        x=t1.add(100,200);
        System.out.println(x);
    }
}
