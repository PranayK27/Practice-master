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
/* In Java iff a variable is of integer type then it is automatically initialized by zero*/
public class Test {
    int a=10; //instance variable
    public static void main(String args[])
    {
        Test t1=new Test();
        Test t2=new Test();
        System.out.println(t1.a);
        System.out.println(t2.a);
        t1.a++;
        t2.a--;
        System.out.println(t1.a);
        System.out.println(t2.a);
    }
    }

