/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.accessrestriction.AccessConditionCheck;
import data.accessrestriction.StandardAccessCondition;
import java.util.HashMap;

/**
 *
 * @author barth
 */
public class GeneralAccess
{
    private static AccessConditionCheck createPatient, createAccessClass;
    private static HashMap<AccessClass, AccessConditionCheck> grantAccessClass = new HashMap();
    
    protected static boolean getCreatePatient(Person caller)
    {
        if(createPatient != null) return(createPatient.evaluate(caller));
        else return(false);
    }
    
    protected static boolean getCreateAccessClass(Person caller)
    {
        if(createAccessClass != null) return(createAccessClass.evaluate(caller));
        else return(false);
    }
    
    protected static boolean getGrantAccessClass(AccessClass check, Person caller)
    {
        if(grantAccessClass.keySet().contains(check)) return(grantAccessClass.get(check).evaluate(caller));
        else return(false);
    }
}
