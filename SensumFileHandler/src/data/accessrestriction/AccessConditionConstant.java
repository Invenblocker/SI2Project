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
public class AccessConditionConstant extends AccessCondition
{
    private boolean value;
    
    AccessConditionConstant(boolean value)
    {
        this.value = value;
    }
    
    protected boolean evaluate(Person caller)
    {
        return(value);
    }
}
