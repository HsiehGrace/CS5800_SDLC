package Memento_Mediator;

import java.util.ArrayList;

public class Message {
    private String sender;
    private String message;
    private String timeStamp;
    ArrayList<String> recipients;

    Message(String sender, String message, String timeStamp, ArrayList<String> recipients) {
        this.sender = sender;
        this.message = message;
        this.timeStamp = timeStamp;
        this.recipients = recipients;
    }

    Message(MessageMemento message){
        this.sender = "";
        this.message = message.getMessage();
        this.timeStamp = message.getTimeStamp();
    }

    Message(String message, String timeStamp){
        this.message=message;
        this.timeStamp=timeStamp;
    }

    public String getSender() {
        return this.sender;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTimeStamp() {
        return this.timeStamp;
    }

    public void addRecipient(String recipient){
        recipients.add(recipient);
    }


    public String toString(){
        return this.sender + "\n" + this.timeStamp + ": "+ this.message;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message checkMessage = (Message) o;
        return checkMessage.getMessage().equals(this.getMessage()) && checkMessage.getTimeStamp().equals(this.getTimeStamp());
    }
}
