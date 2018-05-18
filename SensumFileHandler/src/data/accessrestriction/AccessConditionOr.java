/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.accessrestriction;

import data.Person;

/**
 *
 * @author barth
 */
public class AccessConditionOr extends BooleanAccessCondition
{
    private AccessCondition[] conditions;
    
    AccessConditionOr(AccessCondition... conditions)
    {
        this.conditions = conditions;
    }
    
    protected boolean evaluate(Person caller)
    {
        for(AccessCondition condition : conditions)
        {
            if(condition.evaluate(caller)) return(true);
        }
        return(false);
    }
}
