package obj;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ApptRequest {
    private int requestId;
    private int personId;
    private ArrayList<LocalDateTime> preferredDays;
    private boolean isNew;
    private ArrayList<Integer> preferredDocs;

    public ApptRequest() {
    }

    public ApptRequest(int requestId, int personId, ArrayList<LocalDateTime> preferredDays, boolean isNew, ArrayList<Integer> preferredDocs) {
        this.requestId = requestId;
        this.personId = personId;
        this.preferredDays = preferredDays;
        this.isNew = isNew;
        this.preferredDocs = preferredDocs;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public ArrayList<LocalDateTime> getPreferredDays() {
        return preferredDays;
    }

    public void setPreferredDays(ArrayList<LocalDateTime> preferredDays) {
        this.preferredDays = preferredDays;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public ArrayList<Integer> getPreferredDocs() {
        return preferredDocs;
    }

    public void setPreferredDocs(ArrayList<Integer> preferredDocs) {
        this.preferredDocs = preferredDocs;
    }
}
