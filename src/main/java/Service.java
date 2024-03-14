import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Service {
    public Service() {
//        String apiUrl = "https://scheduling.interviews.brevium.com/api/Scheduling/AppointmentRequest?token=28880432-e1e7-428f-a5b5-08fa29e5442a";
//
//        try{
//
//            URL url = new URL(apiUrl);
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("POST");
//            conn.setRequestProperty("Content-Type", "application/json");
//            conn.setDoOutput(true);
//
//            int responseCode = conn.getResponseCode();
//            conn.disconnect();
//        } catch(Exception e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
    }

    public void stop(){
        //post stop to the API
    }

    public void postAppt(String appt){
        //post appointment to the schedule API
    }
    public String getInitialSchedule(){
        String url = "https://scheduling.interviews.brevium.com/api/Scheduling/Schedule?token=28880432-e1e7-428f-a5b5-08fa29e5442a";
        return getRequest(url);
    }
    public String getApptRequest(){
        String url = "https://scheduling.interviews.brevium.com/api/Scheduling/AppointmentRequest?token=28880432-e1e7-428f-a5b5-08fa29e5442a";

        return getRequest(url);
    }

    private String getRequest(String apiUrl){
        String response = "";
        try{

            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            int responseCode = conn.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            if(responseCode != 200){
                return null;
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String next = null;
            while ((next=br.readLine())!=null) {
                response +=next;
            }
            br.close();
            conn.disconnect();
        } catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        }
        return response;
    }
}
