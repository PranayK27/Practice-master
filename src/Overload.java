/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranay
 */
class OverloadDemo{
    void test()
    {
        System.out.println("No Parameters");
    }
    void test(int a)
    {
        System.out.println("a: "+a);
    }
    void test(int a,int b)
    {
        System.out.println("a and b "+a+ " "+b);
    }
    double test(double a)
    {
        System.out.println("double a: "+a);
        return a*a;
    }
}

public class Overload {
    public static void main(String args[])
    {
        OverloadDemo ob=new OverloadDemo();
        double result;
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25) is: "+result);
    }
}
