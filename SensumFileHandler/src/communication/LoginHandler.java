/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
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
    
    protected LoginHandler(Socket socket)
    {
        this.socket = socket;
    }
    
    @Override
    public void run()
    {
        try
        {
            Scanner in = new Scanner(socket.getInputStream());
            while(true)
            {
                String loginAttempt = in.nextLine();
                String[] loginAttemptSplit = loginAttempt.split(" ");
                if(loginAttemptSplit.length > 1)
                {
                    IOHandler user = IOHandler.login(loginAttemptSplit[0], loginAttempt.substring(loginAttemptSplit[0].length()), socket);
                    if(user != null)
                    {
                        return;
                    }
                }
            }
        }
        catch (IOException ex)
        {
            Logger.getLogger(LoginHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
