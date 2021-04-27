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
public class SortingStringArray {
    public static void main(String args[])
    {
        String str[]={"indore","bhopal","dewas","ujjain","dhar","mhow","harda","khandwa"};
        int i,j;
        String temp;
        for(i=0; i<(str.length);i++)
        {
         for(j=(i+1);j<str.length;j++)
         {
             if(str[i].compareTo(str[j])>0)
             {
                 temp=str[i];
                 str[i]=str[j];
                 str[j]=temp;
             }
         }
        }
        for(String S:str)
        {
            System.out.println(S);
        }
    }
}
