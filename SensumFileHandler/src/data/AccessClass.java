/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author barth
 */
public class AccessClass
{
    private final String NAME;
    private final int ID;
    private static ArrayList<AccessClass> accessClasses = new ArrayList();
    
    protected AccessClass(String name)
    {
        this.NAME = name;
        this.ID = accessClasses.size();
        accessClasses.add(this);
        
        System.out.println("Created Access Class with name " + name + " and ID " + ID);
    }
    
    protected String getName()
    {
        return(NAME);
    }
    
    protected static ArrayList<AccessClass> getAccessClasses()
    {
        return((ArrayList)accessClasses.clone());
    }
    
    protected int getId()
    {
        return(ID);
    }
    
    public String toString()
    {
        return("AccessClass: \"" + NAME + "\" Created and assigned the ID number " + ID + '.');
    }
    
    protected static AccessClass getAccessClass(int i)
    {
        return(accessClasses.get(i));
    }
}
