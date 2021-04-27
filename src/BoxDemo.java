/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranay
 */
class Box1
{
    double width;
    double height;
    double depth;
    
    Box1()
    {
        System.out.println("Constructor of class Box ");
        width=10;
        height=10;
        depth=10;
    }
    double volume()
    {
        return width*height*depth;
    }
}
public class BoxDemo {
    public static void main(String args[])
    {
        Box1 o1=new Box1();
        Box1 o2=new Box1();
        double vol;
        vol=o1.volume();
        System.out.println("Volume: "+vol);
        vol=o2.volume();
        System.out.println("Volume: "+vol);
    }
}
