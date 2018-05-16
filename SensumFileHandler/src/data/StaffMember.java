/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Collection;

/**
 *
 * @author barth
 */
public class StaffMember extends Person{
    private StaffRole staffRole;
    private Collection<AccessClass> permissions;
    private Collection<AccessClass> restrictions;

    public StaffRole getStaffRole() {
        return staffRole;
    }

    public Collection<AccessClass> getPermissions() {
        return permissions;
    }

    public Collection<AccessClass> getRestrictions() {
        return restrictions;
    }
    
    
    
}
