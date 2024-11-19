package Memento_Mediator;

import java.util.ArrayList;
import java.util.Iterator;

public class User implements IterableByUser{
    private String username;
    private ChatHistory chatHistory;

    // Mediator
    private final ChatServer chatServer;

    // Memento
    private MessageMemento messageMemento;


    public User(String username, ChatServer chatServer) {
        this.username = username;
        this.chatHistory = new ChatHistory();
        this.chatServer = chatServer;
        this.messageMemento = new MessageMemento();
        this.indexForIterator = 0;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Send Message
    public void sendMessage(String message, ArrayList<String> recipients) {
        String timestamp = this.chatServer.sendMessage(this, message, recipients);
        this.messageMemento.setMessage(message);
        this.messageMemento.setTimestamp(timestamp);

    }

    // Receive Message
    public void recieveMessage(Message message) {
        this.chatHistory.addMessage(message);
    }

    public boolean removeMessage(Message message) {

        return this.chatHistory.removeMessage(message);
    }


    // Undo last message
    public void undoLastMessage() {
        System.out.println("Removing last message:");
        System.out.println(this.messageMemento);
        this.chatServer.removeMessage(this.messageMemento);
    }

    public void printChatHistory() {
        System.out.println(this.username + "'s chat history:");
        this.chatHistory.printChatHistory();
    }

    public void printFromUser(String username) {
        this.chatHistory.printFromUser(username);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;

        return user.getUsername().equals(this.getUsername());
    }

    @Override
    public Iterator iterator(User userToSearchWith) {
        return null;
    }

    @Override
    public boolean hasNext() {
        return this.chatHistory.hasNext();
    }

    @Override
    public Object next() {
        return this.chatHistory.next();
    }
}
