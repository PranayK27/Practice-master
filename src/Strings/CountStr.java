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
public class CountStr {
     public static void main(String args[])
    {
        
        String str="This is a class of Java";
        int sp=0, ch=0, i;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                sp++;
            }
            else
            {
                ch++;
            }
        }
        System.out.println("Char= "+ch);
        System.out.println("Space= "+sp);
    }
   
}
