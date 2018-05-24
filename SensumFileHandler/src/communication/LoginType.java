/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

import data.Patient;
import data.Person;
import data.StaffMember;
import java.util.Scanner;

/**
 *
 * @author minne
 */
public class LoginType {
    private static Person user;
    
    public static void setPerson(){
        boolean set = false;
        /*
        while(!set){
            System.out.println("Enter number to set user person type:\n"
                + "SuperAdmin: 1\n"
                + "Patient: 2\n"
                + "StaffMember: 3");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
        
            switch(input){
                case 1: user = StaffMember.getSuperAdmin();
                set = true;
                break;

                case 2: user = Patient.createPatient(StaffMember.getSuperAdmin());
                set = true;
                break;

                case 3: user = StaffMember.createStaffMember(StaffMember.getSuperAdmin);//TODO
                set = true;
                break;
          
            }
            scanner.close();
        }*/
        
    }
    
    public Person getPerson(){
        return user;
    }
}
