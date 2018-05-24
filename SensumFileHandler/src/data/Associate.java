/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.List;

/**
 *
 * @author barth
 */
public class Associate extends Person
{
    Associate(String name, String cpr, int phoneNumber, String email)
    {
        super(name, cpr, phoneNumber, email);
    }
    
    private List<AccessClass> permissions;
    
    public List<AccessClass> getPermissions() {
        return permissions;
    }
}