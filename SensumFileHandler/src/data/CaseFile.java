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
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author EGHG
 */
public class CaseFile {
    private String name;
    private HashSet<Person> authors;
    private Date date;
    private RevisionHistory revisions;
    private AccessConditionCheck accessCondition;
    private Case connectedCase;
    
    public CaseFile(String name, StaffMember author, File content, Case connectedCase)
    {
        this(name, author, content, connectedCase, connectedCase.getDefaultAccessCondition());
    }
    
    public CaseFile(String name, Person author, File content, Case connectedCase, AccessConditionCheck accessCondition)
    {
        this.name = name;
        this.authors = new HashSet();
        authors.add(author);
        this.connectedCase = connectedCase;
        this.accessCondition = accessCondition;
        
        revisions = new RevisionHistory(author, content);
    }

    public String getName() {
        return name;
    }

    public HashSet<Person> getAuthors() {
        return authors;
    }

    public Date getDate() {
        return date;
    }

    public File getContent(Person caller)
    {
        if(accessCondition.evaluate(caller)) return(revisions.getEntries().getLast()).getFile();
        else return(null);
    }

    public RevisionHistory getRevisions(Person caller)
    {
        if(accessCondition.evaluate(caller)) return(revisions);
        else return(null);
    }
    
    public Case getCase()
    {
        return(connectedCase);
    }
}
