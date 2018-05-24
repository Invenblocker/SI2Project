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
public class StaffMember extends Person
{
    private StaffRole staffRole;
    private HashSet<AccessClass> accessOverwrites;
    private static StaffMember superAdmin;
    
    public StaffMember(String name, String cpr, int phoneNumber, String email, StaffRole staffRole)
    {
        super(name, cpr, phoneNumber, email);
        this.staffRole = staffRole;
    }
    
    public StaffRole getStaffRole()
    {
        return(staffRole);
    }
    
    public HashSet<AccessClass> getPersonalAccess()
    {
        return(super.getAccess());
    }
    
    public HashSet<AccessClass> getAccesOverwrites()
    {
        return((HashSet)accessOverwrites.clone());
    }
    
    @Override
    public HashSet<AccessClass> getAccess()
    {
        HashSet<AccessClass> totalAccess = new HashSet();
        
        for(AccessClass accessClass : staffRole.getPermissions())
        {
            if(!accessOverwrites.contains(accessClass)) totalAccess.add(accessClass);
        }
        for(AccessClass accessClass : getPersonalAccess())
        {
            totalAccess.add(accessClass);
        }
        
        return(totalAccess);
    }
    
    protected static StaffMember getSuperAdmin()
    {
        if(superAdmin != null) return(superAdmin);
        else
        {
            superAdmin = new StaffMember("Super Admin", "0123456789", 0, "", StaffRole.getSuperAdmin());
            return(superAdmin);
        }
    }
    
    public boolean isSuperAdmin()
    {
        return(this.equals(getSuperAdmin()));
    }
}
