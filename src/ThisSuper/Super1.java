/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThisSuper;

/**
 *
 * @author Pranay
 */
public class Super1 {
    Super1(int x)
    {
        System.out.println("Class Super1 "+x);
    }
}
class Super2 extends Super1{
    Super2()
    {
        super(50);
        System.out.println("Class Super2");
    }
}
class Main1
{
    public static void main(String args[])
    {
        Super1 a1=new Super1(10);
        Super2 s2=new Super2();
    }
}
