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
    private ArrayList<Associate> Associate;
    private Institute institute;
    
    public Appointment(Date date, Patient patient, Collection<StaffMember> staff, Collection<Associate> associates, Institute institute)
    {
        this.date = date;
        this.patient = patient;
        this.staff = new ArrayList();
        this.Associate = new ArrayList();
        
        
    }
}
