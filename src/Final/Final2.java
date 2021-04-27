/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author Pranay
 */
public class Final2 {
    final int a;
    Final2(int x)
    {
        a=x;
    }
    void show()
    {
        System.out.println(a);
    }
    public static void main(String args[])
    {
        Final2 f1=new Final2(10);
        f1.show();
        Final2 f2=new Final2(20);
        f2.show();
    }
}
