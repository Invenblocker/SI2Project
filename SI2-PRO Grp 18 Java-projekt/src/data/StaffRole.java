/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author barth
 */
public class StaffRole
{
    private String name;
    private HashSet<AccessClass> permissions;
    private static StaffRole superAdmin;
    
    public StaffRole(String name, Collection<AccessClass> permissions)
    {
        this.name = name;
        this.permissions = new HashSet();
        for(AccessClass accessClass : permissions)
        {
            this.permissions.add(accessClass);
        }
    }
    
    public StaffRole(String name, AccessClass... permissions)
    {
        this.name = name;
        this.permissions = new HashSet();
        for(int i = 0; i < permissions.length; i++)
        {
            this.permissions.add(permissions[i]);
        }
    }
    
    public String getName()
    {
        return(name);
    }
    
    public HashSet<AccessClass> getPermissions()
    {
        return((HashSet)permissions.clone());
    }
    
    protected static StaffRole getSuperAdmin()
    {
        if(superAdmin != null) return(superAdmin);
        else
        {
            superAdmin = new StaffRole("Super Admin", new HashSet());
            return(superAdmin);
        }
    }
}
