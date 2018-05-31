/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author barth
 */
public class DataAccessRequest extends Request{
    private CaseFile file;
    
    public DataAccessRequest(Associate requestee, StaffMember handler, CaseFile file)
    {
        super(requestee, handler);
        this.file = file;
    }
    
    public DataAccessRequest(StaffMember requestee, StaffMember handler, CaseFile file)
    {
        super(requestee, handler);
        this.file = file;
    }

    public CaseFile getFile() {
        return file;
    }
    
}

