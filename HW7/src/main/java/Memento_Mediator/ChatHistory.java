package Memento_Mediator;

import java.util.ArrayList;

public class ChatHistory {
    ArrayList<Message> chatHistory;

    ChatHistory() {
        chatHistory = new ArrayList<>();
    }

    public void addMessage(Message m) {
        chatHistory.add(m);
    }

    public Message lastMessage(){
        return chatHistory.getLast();
    }

    // If a message is undone remove the history?
    public void removeLastMessage(){
        chatHistory.removeLast();
    }
}
