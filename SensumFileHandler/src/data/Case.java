/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.accessrestriction.AccessConditionCheck;
import java.util.HashSet;
import java.util.ArrayList;

/**
 *
 * @author Aske Wulf
 */
public class Case {
    private Patient patient;
    private ArrayList<CaseFile> files;
    private HashSet<StaffMember> staff;
    private HashSet<Associate> associates;
    private AccessConditionCheck defaultAccessCondition;
    
    protected Case(Patient patient, HashSet<StaffMember> staff, HashSet<Associate> associates)
    {
        this.defaultAccessCondition = GeneralData.generateDefaultAccessCondition();
        this.patient = patient;
        this.files = new ArrayList();
        this.staff = (HashSet)staff.clone();
        this.associates = (HashSet)associates.clone();
    }
    
    public Patient getPatient() {
        return patient;
    }

    public ArrayList<CaseFile> getFiles() {
        return files;
    }

    public HashSet<StaffMember> getStaff() {
        return staff;
    }
    
    public HashSet<Associate> getAssociates()
    {
        return(associates);
    }
    
    public AccessConditionCheck getDefaultAccessCondition()
    {
        return(defaultAccessCondition);
    }
}
