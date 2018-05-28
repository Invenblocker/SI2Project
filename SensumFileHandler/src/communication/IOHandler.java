/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

import data.IOFacade;
import data.Person;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author barth
 */
public class IOHandler implements Runnable
{
    private Person user;
    private IOFacade dataFacade;
    private Socket socket;
    private LinkedList<IOHandler> loggedInUsers = new LinkedList();
    
    private IOHandler(Person user, Socket socket)
    {
        this.user = user;
        this.socket = socket;
        loggedInUsers.add(this);
        this.run();
    }
    
    public static IOHandler login(String mail, String password, Socket socket)
    {
        Person user = IOFacade.attemptLogin(mail, password);
        if(user != null) return(new IOHandler(user, socket));
        else return(null);
    }

    @Override
    public void run()
    {
        BufferedReader input;
        try
        {
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            while(true)
            {
                System.out.println(input.readLine());
            }
        }
        catch (IOException ex)
        {
            Logger.getLogger(IOHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
