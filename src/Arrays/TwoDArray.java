/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Pranay
 */
public class TwoDArray {
   public static void main(String args[])
   {
       int twodarray[][]=new int[4][5];
       int i,j,k=0;
       
       for(i=0;i<4;i++) //row
       {
           for(j=0;j<5;j++) //column
           {
               twodarray[i][j]=k;
               k++;
           }
       }
       for(i=0;i<4;i++)
       {
           for(j=0;j<5;j++)
           {
               System.out.print(twodarray[i][j]+" ");
           }System.out.println();
       }
   }
}
