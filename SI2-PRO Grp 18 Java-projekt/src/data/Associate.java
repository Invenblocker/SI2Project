/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.HashSet;

/**
 *
 * @author barth
 */
public class Associate extends Person
{
    private HashSet<Patient> patients;
    
    Associate(String name, String cpr, String phoneNumber, String email, HashSet<Patient> patients)
    {
        super(name, cpr, phoneNumber, email);
        
        this.patients = new HashSet();
        for(Patient patient : patients)
        {
            this.patients.add(patient);
        }
    }
    
    protected boolean addAssociatedPatient(Patient patient)
    {
        return(patients.add(patient));
    }
    
    protected boolean removeAssociatedPatient(Patient patient)
    {
        return(patients.remove(patient));
    }
    
    protected HashSet<Patient> getAssociatedPatients()
    {
        return((HashSet)patients.clone());
    }
}