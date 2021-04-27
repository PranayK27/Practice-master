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
public class OwnException extends Exception {
    String str;
    OwnException(String Temp)
    {
        str=Temp;
    }
    public String toString()
    {
        return("Own Exception: "+str);
    }
}
class TestException
{
    public static void main(String args[])
    {
        int a=10,b=2,c;
        try{
            if(b==2)
            {
                throw new OwnException("/by two");
            }
            else
            {
                c=a/b;
                System.out.println(c);
            }
        }
        catch(OwnException e)
        {
            System.out.println(e);
        }
    }
}
