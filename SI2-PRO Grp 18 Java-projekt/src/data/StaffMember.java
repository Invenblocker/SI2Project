/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

/**
 *
 * @author barth
 */
public class StaffMember extends Person
{
    private StaffRole staffRole;
    private HashSet<AccessClass> accessOverwrites;
    private static StaffMember superAdmin;
    private ArrayList<Request> requests;
    
    public StaffMember(String name, String cpr, String phoneNumber, String email, StaffRole staffRole)
    {
        super(name, cpr, phoneNumber, email);
        this.staffRole = staffRole;
        requests = new ArrayList();
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
        return(superAdmin);
    }
    
    public boolean isSuperAdmin()
    {
        return(this.equals(getSuperAdmin()));
    }
    
    public static void setupSuperAdmin(String name, String cpr, String phoneNumber, String email)
    {
        if(superAdmin == null)
        {
            superAdmin = new StaffMember(name, cpr, phoneNumber, email, StaffRole.getSuperAdmin());
        }
    }
    
    protected void addRequest(Request request)
    {
        requests.add(request);
    }
    
    protected Request[] listRequests(Person caller)
    {
        if(this.equals(caller))
        {
            Request[] requestClone = new Request[requests.size()];
            for(int i = 0; i < requestClone.length; i++)
            {
                requestClone[i] = requests.get(i);
            }
            return(requestClone);
        }
        return(null);
    }
}
