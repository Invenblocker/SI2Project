/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.accessrestriction;

import data.CaseFile;
import data.Person;

/**
 *
 * @author barth
 */
public class OrAccessCondition extends AccessCondition
{
    private AccessCondition[] conditions;
    
    public OrAccessCondition(AccessCondition... conditions)
    {
        this.conditions = conditions;
    }
    
    protected boolean evaluate(Person caller, CaseFile caseFile)
    {
        for(AccessCondition condition : conditions)
        {
            if(condition.evaluate(caller, caseFile)) return(true);
        }
        return(false);
    }
}
