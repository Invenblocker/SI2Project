/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

import data.IOFacade;
import data.Person;
import java.net.Socket;

/**
 *
 * @author barth
 */
public class IOHandler
{
    private Person user;
    private IOFacade dataFacade;
    private Socket socket;
    
    private IOHandler(Person user, Socket socket)
    {
        this.user = user;
        this.socket = socket;
    }
    
    public static IOHandler login(String mail, String password, Socket socket)
    {
        Person user = IOFacade.attemptLogin(mail, password);
        if(user != null) return(new IOHandler(user, socket));
        else return(null);
    }
}
