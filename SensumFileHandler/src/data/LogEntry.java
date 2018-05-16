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
public class LogEntry {
    private Date date;
    private String title;
    private String description;
    private File before;
    private File after;
    private Person responsible;

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public File getBefore() {
        return before;
    }

    public File getAfter() {
        return after;
    }

    public Person getResponsible() {
        return responsible;
    }
    
}
