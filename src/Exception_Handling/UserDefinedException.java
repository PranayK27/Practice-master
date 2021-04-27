/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_Handling;

/**
 *
 * @author Pranay
 */
class InvalidAgeException extends Exception
{
    private int age;
    InvalidAgeException(int a)
    {
        age=a;
    }
    public String toString()
    {
        return "Age: "+age+" is not valid age.";
    }
}    
public class UserDefinedException {
    static void checkAge(int age) throws InvalidAgeException
    {
        System.out.println("Checking Age Validity: ("+age+")");
        if(age<0||age>100)
            throw new InvalidAgeException(age);
        System.out.println("Age: "+age+" is a valid age.");
    }
    public static void main(String args[])
    {
        try
        {
            checkAge(25);
            checkAge(-5);
        }
        catch(InvalidAgeException e)
        {
            System.out.println("Caught: "+e);
        }
    }
}
