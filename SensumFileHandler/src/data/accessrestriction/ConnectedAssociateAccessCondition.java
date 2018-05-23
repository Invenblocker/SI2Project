/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.accessrestriction;

import data.CaseFile;
import data.Person;
import data.Associate;

/**
 *
 * @author barth
 */
public class ConnectedAssociateAccessCondition extends AccessCondition
{
    private boolean trueEvaluate(Associate caller, CaseFile caseFile)
    {
        return(caseFile.getCase().getStaff().contains(caller));
    }
    
    protected boolean evaluate(Person caller, CaseFile caseFile)
    {
        if(caller instanceof Associate) return trueEvaluate((Associate) caller, caseFile);
        else return(false);
    }
}
