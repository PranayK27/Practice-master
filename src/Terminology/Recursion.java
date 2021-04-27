/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terminology;

/**
 *
 * @author Pranay
 */
class RecTest{
    int values[];
    RecTest(int i){
        values=new int[i];
    }
    void printArray(int i)
    {
        if(i==0) return;
        else printArray(i-1);
        System.out.println("["+(i-1)+"]"+values[i-1]);
    }
}
public class Recursion {
    public static void main(String args[])
    {
        RecTest r=new RecTest(10);
        int i;
        for(i=0;i<10;i++) r.values[i]=i;
        r.printArray(10);
    }
}
