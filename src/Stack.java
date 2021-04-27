/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranay
 */
class StackDemo
    {
        int stck[]=new int[10];
        int tos;
        StackDemo()
        {
            tos=-1;
        }
        void push(int item)
        {
            if(tos==9)
            {
                System.out.println("Stack is Full ");
            }
            else
            {
                stck[++tos]=item;
            }
        }
        int pop()
        {
            if(tos<0)
            {
                System.out.println("Stack Underflow ");
                return 0;
            }
            else
            {
                return stck[tos--];
            }
        }
    }
class Stack{
    public static void main(String args[])
    {
        StackDemo mystack1=new StackDemo();
        StackDemo mystack2=new StackDemo();
        //push numbers into the stack
        for(int i=0;i<10;i++) mystack1.push(i);
        for(int i=0;i<20;i++) mystack2.push(i);
        //pop numbers from the stack
        System.out.println("Stack in mystack1: ");
        for(int i=0;i<10;i++)
            System.out.println(mystack1.pop());
        System.out.println("Stack in mystack2: ");
        for(int i=0;i<10;i++)
            System.out.println(mystack2.pop());
    }
}