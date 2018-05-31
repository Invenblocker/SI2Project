/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.HashMap;

/**
 *
 * @author barth
 */
public enum RecognizedCommands
{
    CREATE_ACCESS_CLASS("createaccessclass"),
    LOGOUT("logout"),
    UNKNOWN("");
    
    private String name;
    
    RecognizedCommands(String name)
    {
        this.name = name.toLowerCase();
    }
    
    protected String getName()
    {
        return(name);
    }
}
