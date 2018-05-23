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
public class PersonAccessCondition extends AccessCondition
{
    private Person condition;
    
    public PersonAccessCondition(Person condition)
    {
        this.condition = condition;
    }
    
    protected boolean evaluate(Person caller, CaseFile caseFile)
    {
        if(condition != null && caller != null) return(caller.equals(condition));
                else return(false);
    }
}
