/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.accessrestriction;

import data.CaseFile;
import data.Person;
import data.StaffMember;
import data.StaffRole;

/**
 *
 * @author barth
 */
public class StaffRoleAccessCondition extends AccessCondition
{
    private StaffRole condition;
    
    public StaffRoleAccessCondition(StaffRole condition)
    {
        this.condition = condition;
    }
    
    private boolean trueEvaluate(StaffMember caller, CaseFile caseFile)
    {
        if(caller == null) return(false);
        if(condition == null) return(true);
        else
        {
            if(caller.getStaffRole() != null) return(caller.getStaffRole().equals(condition));
            else return(false);
        }
    }
    
    protected boolean evaluate(Person caller, CaseFile caseFile)
    {
        if(caller instanceof StaffMember) return(trueEvaluate((StaffMember)caller, caseFile));
        else return(false);
    }
}
