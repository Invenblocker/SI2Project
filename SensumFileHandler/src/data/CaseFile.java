/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.accessrestriction.AccessCondition;
import data.accessrestriction.AccessConditionCheck;
import java.io.File;
import java.util.Date;
import java.util.List;

/**
 *
 * @author EGHG
 */
public class CaseFile {
    private String name;
    private StaffMember author;
    private Date date;
    private File content;
    private List<RevisionHistory> revisions;
    private AccessConditionCheck accessCondition;
    private Case connectedCase;

    public String getName() {
        return name;
    }

    public StaffMember getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    public File getContent(Person caller)
    {
        if(accessCondition.evaluate(caller)) return(content);
        else return(null);
    }

    public List<RevisionHistory> getRevisions(Person caller)
    {
        if(accessCondition.evaluate(caller)) return(revisions);
        else return(null);
    }
    
    public Case getCase()
    {
        return(connectedCase);
    }
}
