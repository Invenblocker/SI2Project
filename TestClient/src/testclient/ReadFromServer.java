/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclient;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author barth
 */
public class ReadFromServer implements Runnable
{
    private Socket socket;
    
    ReadFromServer(Socket socket)
    {
        this.socket = socket;
    }

    @Override
    public void run()
    {
        try
        {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            while(true)
            {
                System.out.println(input.readLine());
            }
        } 
        catch (IOException ex)
        {
            Logger.getLogger(ReadFromServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
