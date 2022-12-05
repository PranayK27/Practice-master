/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

/**
 *
 * @author Pranay
 */
public class Array {
    public static void main(String args[])
    {
        int a[]={50,60,30,70,20,40,10,90,80};
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }System.out.println(max);
    }
}
