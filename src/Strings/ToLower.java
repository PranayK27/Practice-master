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
public class ToLower {
    public static void main(String args[])
    {
        String str="INDIA";
        char ch; // characters from 65 to 90 are in upper case therefore to convert we use '+32'
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch>=65 && ch<=90)
            {
                System.out.println((char)(ch+32));
            }
            else
            {
                System.out.println(ch);
            }
        }
    }
}
    

