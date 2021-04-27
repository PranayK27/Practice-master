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
public class TwoDAgain {
    public static void main(String args[])
    {   
    int twod[][]=new int[4][];
    twod[0]=new int[1];
    twod[1]=new int[2];
    twod[2]=new int[3];
    twod[3]=new int[4];
    int i,j,k=0;
    
    for(i=0;i<4;i++)
       {
           for(j=0;j<i+1;j++)
           {
               twod[i][j]=k;
               k++;
           }
       }
       for(i=0;i<4;i++)
       {
           for(j=0;j<i+1;j++)
           {
               System.out.print(twod[i][j]+" ");
           }System.out.println();
       }
    }
}
