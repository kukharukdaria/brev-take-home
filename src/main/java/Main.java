import obj.Appointment;
import obj.ApptRequest;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args){
        //call start
        Service conn = new Service();

        String jsonAppts = conn.getInitialSchedule();

        Schedule schedule = new Schedule(jsonAppts);
        Scheduler scheduler = new Scheduler();
        JsonParser parser = new JsonParser();

        //run through requests
        while(true){ // repeat until there is no more request
            String requestJ = conn.getApptRequest();
            System.out.println("Request: " + requestJ);
            if(requestJ == null){
                break;
            }

            ApptRequest req = parser.parseApptRequest(requestJ);
            Appointment appt = scheduler.schedule(schedule, req);
            conn.postAppt(parser.parseAppointment(appt));
        }

        conn.stop();
    }
}
