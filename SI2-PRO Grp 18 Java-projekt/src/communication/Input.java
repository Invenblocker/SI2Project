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
    Scanner input;
    
    public Input(Scanner input)
    {
        this.input = input;
        this.user = null;
    }
    
    private boolean login(String mail, String password)
    {
        user = IOFacade.attemptLogin(mail, password);
        return(user != null);
    }
    
    public Person getUser()
    {
        return(user);
    }
    
    public void run()
    {
        System.out.println("Please enter login credentials.");
        while(true)
        {
            String inLine = input.nextLine();
            if(user != null)
            {
                System.out.println(IOFacade.enterCommand(this, inLine));
                System.out.println("Standby for command.");
            }
            else
            {
                String[] splitInput = inLine.split(" ");
                if(splitInput.length > 1)
                {
                    if(login(splitInput[0], inLine.substring(splitInput[0].length() + 1)))
                    {
                        System.out.println("Successfully logged in as " + user.getName());
                    }
                    else
                    {
                        System.out.println("Login attempt failed.");
                    }
                }
                else    System.out.println("Please enter login credentials after the following format\n"
                        + "email password");
            }
        }
    }
}
