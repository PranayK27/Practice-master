/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Pranay
 */
public class Sorting {
    public static void main(String args[])
    {
        int a[]={40,50,20,10,30};
        int i,j,temp;
        for(i=0;i<(a.length-1);i++)
        {
            for(j=(i+1); j<a.length; j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int x:a)
        {
            System.out.println(x);
        }
    }
    
}
