/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranay
 */
public class PatternComplex {
    public static void main(String args[])
    {
     int i,j,k, temp=0;
     for(i=0;i<5;i++)
     {
         for(j=4;j>i;j--)
         {
             System.out.print(" ");
         }
         for(k=0;k<= temp;k++)
         {
             System.out.print("*");
         }System.out.println();
         temp= temp+2;
     }
    }
}
