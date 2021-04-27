/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranay
 */
class Test2
{
    int a;
    Test2(int i)
    {
        a=i;
    }
    Test2 incByTen()
    {
        Test2 temp=new Test2(a+10);
        return temp;
    }
}
public class RetObj {
    public static void main(String args[])
    {
        Test2 ob1=new Test2(2);
        Test2 ob2;
        ob2=ob1.incByTen();
        System.out.println("ob1.a: "+ob1.a);
        System.out.println("ob2.a: "+ob2.a);
        ob2=ob2.incByTen();
        System.out.println("ob1.a: "+ob1.a);
        System.out.println("ob2.a: "+ob2.a);
    }
}
