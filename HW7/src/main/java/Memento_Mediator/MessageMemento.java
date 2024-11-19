package Memento_Mediator;

public class MessageMemento {
    public String message;
    public String timeStamp;
    // Memento Design Pattern

    public MessageMemento() {
        this.message = "";
        this.timeStamp = "";
    }

    public MessageMemento(String message, String timeStamp) {
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimestamp(String timestamp) {
        this.timeStamp = timestamp;
    }

    public String toString(){
        return timeStamp + ": " + message;
    }

}
