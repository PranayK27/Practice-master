/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

/**
 *
 * @author Pranay
 */
public class Static1 {
static int a;
public static void main(String args[])
{
    Static1 t1=new Static1();
    Static1 t2=new Static1();
    Static1 t3=new Static1();
    t1.a=10;
    t2.a=20;
    t3.a=50;
    System.out.println(t1.a);
    System.out.println(t2.a);
    System.out.println(t3.a);
    System.out.println(a);
    System.out.println(Static1.a);
}

}
