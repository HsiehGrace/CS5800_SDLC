package Memento_Mediator;

import java.util.ArrayList;
import java.util.Iterator;


public class ChatHistory implements IterableByUser {

    ArrayList<Message> chatLog;
    private int indexForIterator;

    ChatHistory() {
        chatLog = new ArrayList<>();
        this.indexForIterator = 0;
    }

    public void addMessage(Message m) {
        chatLog.add(m);
    }

    public Message lastMessage(){
        return chatLog.getLast();
    }

    // If a message is undone remove
    public boolean removeMessage(Message message){
        return chatLog.remove(message);
    }

    public void printChatHistory(){
        for (Message m : chatLog) {
            System.out.println(m + "\n");
        }
    }

    public void printFromUser(String user){
        System.out.println("Message From " + user);
        for (Message m : chatLog) {
            if(m.getSender().equals(user)){
                System.out.println(m + "\n");
            }
        }
    }

    public String toString(){
        return chatLog.toString();
    }

    @Override
    public Iterator iterator(User userToSearchWith) {
        return null;
    }

    @Override
    public boolean hasNext() {
        if (indexForIterator < chatLog.size()) {
            indexForIterator++;
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(hasNext()){
            return chatLog.get(indexForIterator++);
        }
        return null;
    }

}
