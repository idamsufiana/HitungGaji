package id.java.hitungpajak.model.response;

import java.util.ArrayList;
import java.util.List;

public class ResponseData<T> {

    private boolean status;
    private List<String> messages = new ArrayList<>();
    private T payload;

    public boolean isStatus() {
        return status;
    }
    public List<String> getMessages() {
        return messages;
    }
    public T getPayload() {
        return payload;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
    public void setPayload(T payload) {
        this.payload = payload;
    }

    
    
    
}
