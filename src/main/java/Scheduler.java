import obj.Appointment;
import obj.ApptRequest;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Scheduler {
    public Appointment schedule(Schedule schedule, ApptRequest req){
        ArrayList<Appointment> relevantConflicts = schedule.getRelevantAppts(req.getPreferredDocs(), req.getPreferredDays());

        ArrayList<LocalDateTime> wantedDays = req.getPreferredDays();
        //check individual rules
        for(LocalDateTime day : wantedDays){
            //delete days that don't pass these checks:

            //check if in range of november-december
            //check if weekday
            //check days that the patient has that fall within a week of existing appt
        }

        //check conflicts
        for(LocalDateTime day : wantedDays){
            int startTime = 8;
            int endTime = 16;
            if(req.isNew()){
                startTime = 15;
                endTime = 16;
            }
            for(int i = startTime; i <= endTime; i++){
                for(Appointment conflict : relevantConflicts){
                    //return first appointment that doesn't conflict
                }
            }
        }
        return null;
    }
}
