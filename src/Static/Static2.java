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
public class Static2 {
static int a;
static void show()
{
    System.out.println(a);
}
public static void main(String args[])
{
    Static2 t1=new Static2();
    t1.a=100;
    t1.show();
    Static2.a=100;
    Static2.show();
}
}
