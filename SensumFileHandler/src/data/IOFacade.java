/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import communication.Input;
import java.util.HashMap;

/**
 *
 * @author barth
 */
public abstract class IOFacade
{
    private static HashMap<String, RecognizedCommands> commands;
    
    public static String enterCommand(Input caller, String request)
    {
        String[] splitRequest = request.split(" ");
        
        switch(getCommand(splitRequest[0]))
        {
            default:
                System.out.println("Failed to recognize command.");
        }
        
        return("Received command " + request + '.');
    }

    public static Person attemptLogin(String mail, String password)
    {
        return(Person.login(mail, password));
    }
    
    private static RecognizedCommands getCommand(String command)
    {
        if(commands == null)
        {
            commands = new HashMap();
            for(RecognizedCommands currentCommand : RecognizedCommands.values())
            {
                commands.put(currentCommand.getName(), currentCommand);
            }
        }
        return(commands.getOrDefault(command, null));
    }
}
