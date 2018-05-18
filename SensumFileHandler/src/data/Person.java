/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author Aske Wulf
 */
public class Person {
    private String userName;
    private String name;
    private int phoneNumber;
    private String email;
    private PersonalLog changeLog;
    private String passWord;
    private HashSet<AccessClass> access;

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public PersonalLog getChangeLog() {
        return changeLog;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Collection<AccessClass> getAccess()
    {
        return((HashSet)access.clone());
    }
}
