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
public class Paramaterised_C {
    int a,b,c;
    Paramaterised_C(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    Paramaterised_C(){}
    void show()
    {
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String args[])
    {
        Paramaterised_C t1=new Paramaterised_C(10,20,30);
        t1.show();
        Paramaterised_C t2=new Paramaterised_C(100,200,300);
        t2.show();
        Paramaterised_C t3=new Paramaterised_C();
        t3.show();
    }
}
