/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import communication.IOHandler;

/**
 *
 * @author barth
 */
public class IOFacade
{
    public static boolean receiveRequest(IOHandler caller, String request)
    {
        return(false);
    }

    public static Person attemptLogin(String mail, String password)
    {
        return(Person.login(mail, password));
    }
}
