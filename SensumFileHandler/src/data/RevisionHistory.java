/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.File;
import java.util.LinkedList;

/**
 *
 * @author Aske Wulf
 */
public class RevisionHistory {
    private LinkedList<FileEntry> entries;
    
    protected RevisionHistory(Person author, File entry)
    {
        entries = new LinkedList();
        entries.add(new FileEntry("Created Document", "First document version", entry, author));
    }

    protected LinkedList<FileEntry> getEntries()
    {
        return((LinkedList)entries.clone());
    }
    
    protected void addEntry(String title, String description, File entry, Person author)
    {
        entries.add(new FileEntry(title, description, entry, author));
    }
}
