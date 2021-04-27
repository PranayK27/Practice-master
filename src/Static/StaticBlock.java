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
public class StaticBlock {
    static int a=10;
    static void show()
    {
        System.out.println(a+5);
    }
    static
    {
        a=a*15;
        System.out.println(a);// runs first
    }
    public static void main(String args[])
    {
        System.out.println("Hello"); // runs second
        System.out.println(a); // runs third
        //StaticBlock.Show();
        System.out.println(StaticBlock.a);// runs fourth
    }

    private static void Show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
