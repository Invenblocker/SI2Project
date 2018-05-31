/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.accessrestriction.AndAccessCondition;
import data.accessrestriction.AccessConditionCheck;
import data.accessrestriction.ConnectedAssociateAccessCondition;
import data.accessrestriction.ConnectedStaffAccessCondition;

/**
 *
 * @author barth
 */
public class GeneralData
{
    protected static AccessConditionCheck generateDefaultAccessCondition()
    {
        return(new AccessConditionCheck(null, new AndAccessCondition(new ConnectedStaffAccessCondition(), new ConnectedAssociateAccessCondition())));
    }
}
