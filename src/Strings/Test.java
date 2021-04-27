/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author Pranay
 */
public class Test {
    public static void main(String args[])
    {
        @SuppressWarnings("RedundantStringConstructorCall")
        String str=new String("Hello");
        System.out.println(str);//prints the string
        System.out.println(str.hashCode());//returns random integer value
        System.out.println(str.length());//prints the length of the string
    }
}
