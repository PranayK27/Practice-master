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
public class Indexof3 {
    public static void main(String args[])
    {
        String str[]={"indore is in india"};
        for (String str1 : str) {
            if (str1.indexOf("ind") == 0) {
                System.out.println(str1);
            }
        }
    }
}
