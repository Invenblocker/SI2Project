/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

import data.StaffMember;

/**
 *
 * @author barth
 */
public class TestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StaffMember.setupSuperAdmin("SuperAdmin", "0000000000", "00000000", "Super@min.sensum");
        
        LoginType.setPerson();
    }
    
}
