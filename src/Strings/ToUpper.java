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
public class ToUpper {
    public static void main(String args[])
    {
        String str="india";
        char ch; // characters from 97 to 122 are in lower case therefore to convert we use '-32'
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch>=97 && ch<=122)
            {
                System.out.println((char)(ch-32));
            }
            else
            {
                System.out.println(ch);
            }
        }
    }
}
