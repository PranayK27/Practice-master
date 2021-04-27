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
public class StaticBlock2 {
    static int a=10;
    static void show()
    {
        System.out.println(a+5);
    }
    static
    {
        a=a*15;
        System.out.println(a);
    }
}
