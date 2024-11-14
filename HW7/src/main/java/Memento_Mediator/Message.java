package Memento_Mediator;

import java.util.ArrayList;

public class Message {
    private String sender;
    private String message;
    private ArrayList<String> recipients;

    Message(String sender, String message){
        this.sender = sender;
        this.message = message;
        this.recipients = new ArrayList<>();
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

    public void addRecipient(String recipient){
        recipients.add(recipient);
    }

}
