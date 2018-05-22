/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.accessrestriction;

import data.CaseFile;
import data.Person;
import data.SuperAdmin;

/**
 *
 * @author barth
 */
public class AccessConditionCheck
{
    private CaseFile caseFile;
    AccessCondition generalAccessCondition, associateAccessCondition, connectedStaffAccessCondition;
    
    public AccessConditionCheck(CaseFile caseFile, AccessCondition generalAccessCondition,
            AccessCondition associateAccessCondition, AccessCondition connectedStaffAccessCondition)
    {
        this.caseFile = caseFile;
        this.generalAccessCondition = generalAccessCondition;
        this.generalAccessCondition = associateAccessCondition;
        this.connectedStaffAccessCondition = connectedStaffAccessCondition;
    }
    
    public boolean evaluate(Person caller)
    {
        if(caller == null) return(false);
        if(caller.equals(SuperAdmin.getSuperAdmin())) return(true);
        if(caseFile.getCase().getPatient().equals(caller)) return(true);
        else if(caseFile.getCase().getAssociates().contains(caller)) return(associateAccessCondition.evaluate(caller));
        else if(caseFile.getCase().getStaff().contains(caller)) return(connectedStaffAccessCondition.evaluate(caller));
        else return(generalAccessCondition.evaluate(caller));
    }
}
