/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multi_Threading;

/**
 *
 * @author Pranay
 */
class Y extends Thread
{
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println(" THREAD Y= "+i);
        }
        System.out.println("END OF THREAD Y");
    }
}

class Z extends Thread
{
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println(" THREAD Z= "+i);
        }
        System.out.println("END OF THREAD Z");
    }
}
public class SetPriority {
    public static void main(String args[])
    {
        Y y=new Y();
        Z z=new Z();
        
        y.start();
        z.start();
        
        System.out.println("END OF MAIN THREAD.");
    }
}
