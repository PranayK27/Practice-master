/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Objects;

/**
 *
 * @author Pranay
 */
public class Array_as_Argument {
    void add(int a[])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        Array_as_Argument t1=new Array_as_Argument();
        int x[]={10,20,30,40,50};
        int y[]={1,2,3,4,5,6,7,8,9,10};
        t1.add(x);
        t1.add(y);
    }
}
