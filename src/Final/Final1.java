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
public class Final1 {
    final int a=10;
    void show()
    {
        // a++; will show error
        System.out.println(a);
    }
    public static void main(String args[])
    {
        Final1 f1=new Final1();
        f1.show();
        f1.show();
    }
}

