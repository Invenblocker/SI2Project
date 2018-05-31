/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author barth
 */
public class Appointment
{
    private Date date;
    private Patient patient;
    private ArrayList<StaffMember> staff;
    private ArrayList<Associate> associates;
    private Institute institute;
    
    public Appointment(Date date, Patient patient, Collection<StaffMember> staff, Collection<Associate> associates, Institute institute)
    {
        this.date = date;
        this.patient = patient;
        this.staff = new ArrayList();
        this.associates = new ArrayList();
        
        for(StaffMember staffMember : staff)
        {
            if(!this.staff.contains(staffMember)) this.staff.add(staffMember);
        }
        
        for(Associate associate : associates)
        {
            if(!this.associates.contains(associate)) this.associates.add(associate);
        }
        
        this.institute = institute;
    }
    
    public Date getDate()
    {
        return(date);
    }
    
    public Patient getPatient()
    {
        return(patient);
    }
    
    public StaffMember[] getStaff()
    {
        StaffMember[] clone = new StaffMember[staff.size()];
        for(int i = 0; i < clone.length; i++) clone[i] = staff.get(i);
        
        return(clone);
    }
    
    public Associate[] getAssociates()
    {
        Associate[] clone = new Associate[associates.size()];
        for(int i = 0; i < clone.length; i++) clone[i] = associates.get(i);
        
        return(clone);
    }
    
    public Institute getInstitute()
    {
        return(institute);
    }
}
