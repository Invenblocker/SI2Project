/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclient;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author barth
 */
public class WriteToServer implements Runnable
{
    private Socket socket;
    private Scanner input;
    
    public WriteToServer(Socket socket, Scanner input)
    {
        this.socket = socket;
        this.input = input;
    }
    
    @Override
    public void run()
    {
        try
        {
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            
            while(true)
            {
                output.writeChars(input.nextLine());
            }
        }
        catch (IOException ex)
        {
            Logger.getLogger(WriteToServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
