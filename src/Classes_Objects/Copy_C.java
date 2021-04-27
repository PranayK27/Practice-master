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
public class Copy_C {
    int a,b,c;
    Copy_C(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    void show()
    {
        System.out.println(a+" "+b+" "+c);
    }
    Copy_C(Copy_C t)
    {
        a=t.a;
        b=t.b;
        c=t.c;
    }
    public static void main(String args[])
    {
        Copy_C t1=new Copy_C(10,20,30);
        Copy_C t2=new Copy_C(t1);
        t1.show();
        t2.show();
        Copy_C t3=new Copy_C(t2);
        t3.show();
    }
}
