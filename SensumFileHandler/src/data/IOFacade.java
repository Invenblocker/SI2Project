/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import communication.Input;

/**
 *
 * @author barth
 */
public class IOFacade
{
    public static String enterCommand(Input caller, String request)
    {
        return("Received command " + request + '.');
    }

    public static Person attemptLogin(String mail, String password)
    {
        return(Person.login(mail, password));
    }
}
