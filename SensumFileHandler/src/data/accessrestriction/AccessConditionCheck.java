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
    AccessCondition accessCondition;
    
    public AccessConditionCheck(CaseFile caseFile, AccessCondition accessCondition)
    {
        this.caseFile = caseFile;
        this.accessCondition = accessCondition;
    }
    
    public boolean evaluate(Person caller)
    {
        if(caller == null) return(false);
        if(caller.equals(SuperAdmin.getSuperAdmin())) return(true);
        if(caseFile.getCase().getPatient().equals(caller)) return(true);
        if(caseFile.getAuthors().contains(caller)) return(true);
        return(accessCondition.evaluate(caller, caseFile));
    }
}
