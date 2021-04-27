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
public class Call_By_Value {
    int a,b,c;
    void show()
    {
        System.out.println(a+" "+b+" "+c);
    }
    void getdata(int x, int y, int z)
    {
        a=x;
        b=y;
        c=z;
    }
    public static void main(String args[])
    {
        Call_By_Value t1=new Call_By_Value();
        Call_By_Value t2=new Call_By_Value();
        t1.getdata(10,20,30);
        t2.getdata(100, 200, 300);
        t1.show();
        t2.show();
    }
}
