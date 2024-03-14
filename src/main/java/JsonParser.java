import obj.Appointment;
import obj.ApptRequest;
import org.json.JSONObject;

public class JsonParser {
    public Appointment parseAppointment(String s){
        JSONObject jsonObject = new JSONObject(s);
        System.out.println(jsonObject);
        return null;
    }
    public ApptRequest parseApptRequest(String s){
        return null;
    }

    public String parseAppointment(Appointment apt){
        return "";
    }

}
