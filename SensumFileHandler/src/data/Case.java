/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author Aske Wulf
 */
public class Case {
    private Patient patient;
    private List<CaseFile> files;
    private Collection<StaffMember> staff;
    private Collection<Associate> associates;
    
    public Patient getPatient() {
        return patient;
    }

    public List<CaseFile> getFiles() {
        return files;
    }

    public Collection<StaffMember> getStaff() {
        return staff;
    }
    
    public Collection<Associate> getAssociates()
    {
        return(associates);
    }
}
