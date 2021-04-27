/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranay
 */
public class Static {
    static void show()
    {
        System.out.println("Show in Static");
    }
}
class Static1
{
    void show()
    {
        System.out.println("Show in Static1");
    }
}
class Statictest
{
    public static void main(String args[])
    {
        Static s =new Static();
        Static1 s1=new Static1();
        //s=s1;
        Static.show();
        s1.show();
    }
}
