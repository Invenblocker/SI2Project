/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Aske Wulf
 */
public class Patient extends Person{
    private ArrayList<Case> cases;
    
    protected Patient(String name, String cpr, int phoneNumber, String email)
    {
        super(name, cpr, phoneNumber, email);
    }

    public ArrayList<Case> getCases() {
        return cases;
    }
    
    private boolean addCase(Case e)
    {
        return cases.add(e);
    }
    
    protected boolean addCase(Person caller, Case e)
    {
        return(cases.add(e));
    }
    
    protected static Patient createPatient(Person caller, String name, String cpr, int phoneNumber, String email, HashSet<StaffMember> staff, HashSet<Associate> associates)
    {
        if(GeneralAccess.getCreatePatient(caller))
        {
            Patient patient = new Patient(name, cpr, phoneNumber, email);
            patient.addCase(new Case(patient, staff, associates));
            return(patient);
        }
        else return(null);
    }
}
    

