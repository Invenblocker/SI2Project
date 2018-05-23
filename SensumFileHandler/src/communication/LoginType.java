/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

import data.Patient;
import data.Person;
import data.StaffMember;
import data.SuperAdmin;
import java.util.Scanner;

/**
 *
 * @author minne
 */
public class LoginType {
    private static Person user;
    
    public static void setPerson(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for person type:\n"
                + "SuperAdmin: 1\n"
                + "Patient: 2\n"
                + "StaffMember: 3");
        int input = scanner.nextInt();
        
        switch(input){
            case 1: user = SuperAdmin.getSuperAdmin();
            break;
            
            //case 2: user = Patient.newPatient();//TODO
            //break;
            
            //case 3: user = StaffMember.newStaffMember();//TODO
          
        }
    }
    
    public Person getPerson(){
        return user;
    }
}
