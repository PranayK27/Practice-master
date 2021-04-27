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
public class Reference_Hold_Object {
    int a=10;
    public static void main(String args[])
    {
        Test t1=new Test();
        Test t2=t1;
        System.out.println(t1);
        System.out.println(t2);
        t1.a++;
        t2.a--;
        System.out.println(t1.a);
        System.out.println(t2.a);
    }
}
