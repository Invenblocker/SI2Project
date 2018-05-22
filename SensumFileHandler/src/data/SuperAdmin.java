/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author barth
 */
public class SuperAdmin extends StaffMember
{
    private static SuperAdmin superAdmin;
    
    private SuperAdmin()
    {
        
    }
    
    public static SuperAdmin getSuperAdmin()
    {
        if(superAdmin != null) return(superAdmin);
        else
        {
            superAdmin = new SuperAdmin();
            return(superAdmin);
        }
    }
}
