/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author barth
 */
public class LoginHandler implements Runnable
{
    private Socket socket;
    private static LinkedList<LoginHandler> loginAttempts = new LinkedList();
    
    protected LoginHandler(Socket socket)
    {
        this.socket = socket;
    }
    
    @Override
    public void run()
    {
        System.out.println("I am here");
        try
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Waiting for message");
            new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())).write("Please enter login details");
            while(true)
            {
                in.reset();
                while(in.ready())
                {
                    String loginAttempt = in.readLine();
                    System.out.println("Received message");
                    System.out.println(loginAttempt);
                    String[] loginAttemptSplit = loginAttempt.split(" ");
                    if(loginAttemptSplit.length > 1)
                    {
                        IOHandler user = IOHandler.login(loginAttemptSplit[0], loginAttempt.substring(loginAttemptSplit[0].length()), socket);
                        if(user != null)
                        {
                            loginAttempts.remove(this);
                            return;
                        }
                    }
                }
            }
        }
        catch (IOException ex)
        {
            Logger.getLogger(LoginHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected static LinkedList<LoginHandler> getLoginAttempts()
    {
        return(loginAttempts);
    }
}
