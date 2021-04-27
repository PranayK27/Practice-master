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
public class Linear_Search {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]={50,60,30,70,20,80,10,100,40,90};
        int n=sc.nextInt();
        int f=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==n)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Failure");
        }
    }
}
