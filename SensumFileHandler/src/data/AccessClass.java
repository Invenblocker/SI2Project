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
    private final String name;
    private final int id;
    private static ArrayList<AccessClass> accessClasses = new ArrayList();
    
    protected AccessClass(String name)
    {
        this.name = name;
        this.id = accessClasses.size();
        accessClasses.add(this);
    }
    
    protected String getName()
    {
        return(name);
    }
    
    protected static ArrayList<AccessClass> getAccessClasses()
    {
        return((ArrayList)accessClasses.clone());
    }
    
    protected int getId()
    {
        return(id);
    }
    
    public String toString()
    {
        return("AccessClass: \"" + name + "\" Created and assigned the ID number " + id + '.');
    }
    
    protected static AccessClass getAccessClass(int i)
    {
        return(accessClasses.get(i));
    }
}
