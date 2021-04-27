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
public class Methods {
    int a,b,c;
    void show()
    {
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String args[])
    {
        Methods t1=new Methods();
        t1.show(); // show 0 0 0
        t1.a=10;
        t1.b=20;
        t1.c=30;
        t1.show();// show 10 20 30
               
    }
}
