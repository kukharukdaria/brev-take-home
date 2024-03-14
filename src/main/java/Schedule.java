import obj.Appointment;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Schedule {
    private ArrayList<Appointment> appointments = new ArrayList<Appointment>();

    public Schedule(String apptS) {
        //parse json appointments into appointments list
    }

    public ArrayList<Appointment> getRelevantAppts(ArrayList<Integer> preferredDocs, ArrayList<LocalDateTime> preferredDays){
        ArrayList<Appointment> relevantAppts = new ArrayList<>();
        for(Appointment appt : appointments){
            for(Integer doc : preferredDocs){
                if(appt.getDoctorId() != doc){
                    continue;
                }
            }
            for(LocalDateTime dateTime : preferredDays){

                if(appt.getAppointmentTime().getDayOfMonth() != dateTime.getDayOfMonth() && appt.getAppointmentTime().getMonthValue() != dateTime.getMonthValue()){
                    continue;
                }
            }
            relevantAppts.add(appt);
        }
        return relevantAppts;
    }

    public void addAppointment(Appointment appt){
        appointments.add(appt);
    }
}
