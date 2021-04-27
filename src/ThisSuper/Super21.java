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
public class Super21 {
    Super21(int x, int y)
    {
        System.out.println("Class Super21 "+x+" "+y);
    }
}
class Super22 extends Super21
{
    Super22(int a,int b,int c)
    {
        super(100,200);
        System.out.println("Class Super22 "+a+" "+b+" "+c);
    }
}
class Main2
{
    public static void main(String args[])
    {
        Super21 a1=new Super21(10,20);
        Super22 a2=new Super22(100,200,300);
    }
}
