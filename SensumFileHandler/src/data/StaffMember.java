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
    private HashSet<AccessClass> permissions, restrictions;
    
    public StaffRole getStaffRole()
    {
        return(staffRole);
    }
    
    public Collection<AccessClass> getPermissions()
    {
        return((HashSet)permissions.clone());
    }
    
    public Collection<AccessClass> getRestrictions()
    {
        return((HashSet)restrictions.clone());
    }
}
