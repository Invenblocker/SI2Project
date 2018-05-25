/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

import data.IOFacade;
import data.Person;

/**
 *
 * @author barth
 */
public class IOHandler
{
    private Person user;
    private IOFacade dataFacade;
    
    private IOHandler(Person user)
    {
        this.user = user;
    }
    
    public static IOHandler login(String mail, String password)
    {
        Person user = IOFacade.attemptLogin(mail, password);
        if(user != null) return(new IOHandler(user));
        else return(null);
    }
}
