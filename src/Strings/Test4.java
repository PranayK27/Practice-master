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
public class Test4 {
    
    public static void main(String args[])
    {
        
        String str1=new String("Hello");
        String str2=new String("hello");
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not Same");
        }
    }
}
