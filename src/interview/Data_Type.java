/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;
import java.util.Scanner;

/**
 *
 * @author Pranay
 */
public class Data_Type {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%400==0)
        {
            System.out.println("LEAP");
        }
        else if(n%100==0)
        {
            System.out.println("NOT LEAP");
        }
        else if(n%4==0)
        {
            System.out.println("LEAP");
        }
        else
        {
            System.out.println("NOT LEAP");
        }
    }
}
