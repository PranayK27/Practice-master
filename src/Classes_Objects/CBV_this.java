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
public class CBV_this {
    int a,b,c;
    void show()
    {
        System.out.println(a+" "+b+" "+c);
    }
    void getdata(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static void main(String args[])
    {
        CBV_this t1=new CBV_this();
        CBV_this t2=new CBV_this();
        t1.getdata(10,20,30);
        t2.getdata(100, 200, 300);
        t1.show();
        t2.show();
    }
}
