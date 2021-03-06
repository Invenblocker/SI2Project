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
public class NotAccessCondition extends AccessCondition
{
    private AccessCondition condition;
    
    public NotAccessCondition(AccessCondition condition)
    {
        this.condition = condition;
    }
    
    protected boolean evaluate(Person caller, CaseFile caseFile)
    {
        return(!condition.evaluate(caller, caseFile));
    }
}
