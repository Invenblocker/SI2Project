/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

import data.IOFacade;
import data.Person;
import java.util.Scanner;

/**
 *
 * @author barth
 */
public class Input implements Runnable
{
    private Person user;
    private IOFacade dataFacade;
    Scanner input;
    
    public Input(Scanner input)
    {
        this.input = input;
        this.user = null;
    }
    
    private boolean login(String mail, String password)
    {
        user = IOFacade.attemptLogin(mail, password);
        return(user == null);
    }
    
    public void run()
    {
        while(true)
        {
            String inLine = input.nextLine();
            System.out.println("Received line: \"" + inLine + '"');
        }
    }
}
