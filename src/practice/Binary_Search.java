/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.Scanner;
/**
 *
 * @author Pranay
 */
public class Binary_Search {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]={10,20,30,40,50,60,70,80,90,100};
        int n=sc.nextInt();
        int f=0,l=0,h=(a.length-1),m;
        while(l<=h)
        {
            m=(l+h)/2;
            if(a[m]==n)
            {
                f=1;
                break;
            }
            else if(n>a[m])
            {
                l=m+1;
            }
            else
            {
                h=m-1;
            }
        }
        if(f==1)
        {
            System.out.println("SUCCESS");
        }
        else
        {
            System.out.println("FAILURE");
        }
    }    
}

