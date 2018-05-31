/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

import data.StaffMember;
import java.util.Scanner;

/**
 *
 * @author barth
 */
public class TestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Input input = new Input(new Scanner(System.in));
        Thread inputThread = new Thread(input);
        
        
        StaffMember.setupSuperAdmin("Super Admin", "0123456789", "12481632", "super@admin.fakelogin.mail");
        
        inputThread.start();
    }
    
}
