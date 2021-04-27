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
public class Overloading {
    void add()
    {
        System.out.println("Default");
    }
    void add(int p, int q)
    {
        System.out.println(p+q);
    }
    void add(int x, int y, int z)
    {
        System.out.println(x+y+z);
    }
    void add(int a, int b, int c, int d)
    {
        System.out.println(a+b+c+d);
    }
    void add(int a,int b, double c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String args[])
    {
        Overloading t1=new Overloading();
        t1.add();
        t1.add(10,20);
        t1.add(100,200,300);
        t1.add(1,2,3,4);
        t1.add(1,2,3.5);
    }
}
