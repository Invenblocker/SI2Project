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
public class AppointmentRequest extends Request
{
    private Appointment appointment;
    
    public AppointmentRequest(Patient requestee, StaffMember handler, Appointment appointment)
    {
        super(requestee, handler);
    }
    
    public AppointmentRequest(Associate requestee, StaffMember handler, Appointment appointment)
    {
        super(requestee, handler);
    }
    
    public Appointment getAppointment()
    {
        return(appointment);
    }
}
