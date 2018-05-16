/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.List;

/**
 *
 * @author Aske Wulf
 */
public class Patient extends Person{
    private List<Case> cases;

    public List<Case> getCases() {
        return cases;
    }
    
    public boolean addCase(Case e){
        if (cases.add(e))
            return true;
        else
            return false;
    }
        
    }
    

