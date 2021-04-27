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
import java.util.Scanner;
public class Test {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i, f=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }              
        }
        if(f==1)
        {
            System.out.println("Not Prime");
        }
        else
        {
            System.out.println("Prime");
        }
    }
            
}
