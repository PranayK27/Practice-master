/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranay
 */
public class Static_Final {
    static final int a;
    static
    {
        a=10;
    }
    void show()
    {
        System.out.println(a);
    }
    public static void main(String args[])
    {
        Static_Final sf=new Static_Final();
        sf.show();
        Static_Final sf2=new Static_Final();
        sf2.show();
    }
}
