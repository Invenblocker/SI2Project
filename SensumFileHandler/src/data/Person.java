/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.HashSet;

/**
 *
 * @author Aske Wulf
 */
public abstract class Person {
    private String username;
    private String name;
    private String phoneNumber;
    private String email;
    private PersonalLog changeLog;
    private String password;
    private HashSet<AccessClass> access;
    private String cpr;
    private static final String PW_GENERATOR_CHARACTERS = "0123456789aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
    
    protected Person(String name, String cpr, String phoneNumber, String email)
    {
        this.name = name;
        StringBuilder createUsername = new StringBuilder(12);
        String[] splitName = name.split(" ");
        if(splitName[0].length() >= 3) createUsername.append(splitName[0].substring(0, 3));
        else createUsername.append(splitName[0]);
        if(splitName[splitName.length - 1].length() >= 3) createUsername.append(splitName[splitName.length - 1].substring(0, 3));
        else createUsername.append(splitName[splitName.length - 1]);
        if(cpr.length() == 10) this.cpr = cpr;
        else throw new IllegalArgumentException("The CPR number " + cpr + " is not a legal argument");
        createUsername.append(String.valueOf(cpr).substring(0, 6));
        this.changeLog = new PersonalLog();
        StringBuilder generatePassword = new StringBuilder();
        for(int i = 0; i < 16; i++)
        {
            generatePassword.append(PW_GENERATOR_CHARACTERS.charAt((int) Math.floor(Math.random() * PW_GENERATOR_CHARACTERS.length())));
        }
        this.password = generatePassword.toString();
        this.access = new HashSet();
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public PersonalLog getChangeLog() {
        return changeLog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public HashSet<AccessClass> getAccess()
    {
        return((HashSet)access.clone());
    }
    
    public boolean evaluatePassword(String password)
    {
        return(this.password.equals(password));
    }
    
    public boolean changePassword(String password, String newPassword1, String newPassword2)
    {
        if(this.password.equals(password) && newPassword1.equals(newPassword2))
        {
            this.password = newPassword1;
            return(true);
        }
        return(false);
    }
}
