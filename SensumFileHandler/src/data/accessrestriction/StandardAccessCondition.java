/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.accessrestriction;

import data.AccessClass;
import data.Person;

/**
 *
 * @author barth
 */
public class StandardAccessCondition extends AccessCondition
{
    private AccessClass condition;
    
    StandardAccessCondition(AccessClass condition)
    {
        this.condition = condition;
    }
    
    protected boolean evaluate(Person caller)
    {
        return(caller.getAccess().contains(condition));
    }
}
