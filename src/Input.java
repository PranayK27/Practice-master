/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Pranay
 */
public class Input {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number:");
        int b=sc.nextInt();
        int c;
        c=a+b;
        System.out.println("The Sum is: "+c);
    }
}
