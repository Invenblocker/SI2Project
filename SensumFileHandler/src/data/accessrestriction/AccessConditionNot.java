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
public class AccessConditionNot extends BooleanAccessCondition
{
    private AccessCondition condition;
    
    AccessConditionNot(AccessCondition condition)
    {
        this.condition = condition;
    }
    
    protected boolean evaluate(Person caller)
    {
        return(!condition.evaluate(caller));
    }
}
