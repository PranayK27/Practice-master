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
public class Practice {

    /**
     * @param args the command line arguments
     */
    //public is used by compiler to run the program
    //static makes program independent, it makes object accessible without classname
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n=153,r,sum=0;
        int temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        while(sum>0)
        {
            r=sum%10;
            switch(r)
                {
                case 0:System.out.println("Zero");
                       break;
                case 1:System.out.println("One");
                       break;
                case 2:System.out.println("Two");
                       break;
                case 3:System.out.println("Three");
                       break;
                case 4:System.out.println("Four");
                       break;
                case 5:System.out.println("Five");
                       break;
                case 6:System.out.println("Six");
                       break;
                case 7:System.out.println("Seven");
                       break;
                case 8:System.out.println("Eight");
                       break;
                case 9:System.out.println("Nine");
                       break;
                default:System.out.println("Invalid Number");
                       break;
                }
            sum=sum/10;
        }
    }
}
