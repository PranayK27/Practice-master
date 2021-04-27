/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WrapperClasses;

/**
 *
 * @author Pranay
 */
import java.io.IOException;
public class OpenNotepad {
    public static void main(String args[])
    {
        try
        {
            Process p=Runtime.getRuntime().exec("Notepad.exe");
            //p.waitFor();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
