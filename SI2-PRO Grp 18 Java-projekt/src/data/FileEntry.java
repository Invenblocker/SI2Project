/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Aske Wulf
 */
public class FileEntry {
    private Date date;
    private String title;
    private String description;
    private File file;
    private Person responsible;
    
    protected FileEntry(String title, String description, File file, Person responsible)
    {
        date = new Date();
        this.title = title;
        this.description = description;
        this.file = file;
        this.responsible = responsible;
    }

    public Date getDate()
    {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public File getFile() {
        return file;
    }

    public Person getResponsible() {
        return responsible;
    }
    
}
