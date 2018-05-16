/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

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

    public String getName() {
        return name;
    }

    public StaffMember getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    public File getContent() {
        return content;
    }

    public List<RevisionHistory> getRevisions() {
        return revisions;
    }
    
        
}
