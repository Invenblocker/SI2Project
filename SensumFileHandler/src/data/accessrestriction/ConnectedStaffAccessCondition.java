/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.accessrestriction;

import data.CaseFile;
import data.Person;
import data.StaffMember;

/**
 *
 * @author barth
 */
public class ConnectedStaffAccessCondition extends AccessCondition
{
    public ConnectedStaffAccessCondition()
    {
        
    }
    
    private boolean trueEvaluate(StaffMember caller, CaseFile caseFile)
    {
        return(caseFile.getCase().getStaff().contains(caller));
    }
    
    protected boolean evaluate(Person caller, CaseFile caseFile)
    {
        if(caller instanceof StaffMember) return trueEvaluate((StaffMember) caller, caseFile);
        else return(false);
    }
}
