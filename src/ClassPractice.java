/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranay
 */
class Box
{
    double w,d,h;
    
    void volume()
    {
        System.out.print("Volume is ");
        System.out.println(w*h*d);
    }
}
public class ClassPractice {
    public static void main(String args[])
    {
        Box a1=new Box();
        Box a2=new Box();
        
        a1.w=10;
        a1.h=20;
        a1.d=15;
        
        a2.w=3;
        a2.h=6;
        a2.d=9;
        
        a1.volume();
        a2.volume();
        
    }
}
