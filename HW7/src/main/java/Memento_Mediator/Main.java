package Memento_Mediator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ChatServer chatServer = new ChatServer();

        User user1 = chatServer.addUser("Phx");
        User user2 = chatServer.addUser("Phy");
        User user3 = chatServer.addUser("Phz");

        ArrayList<String> toPeople = new ArrayList<>();
        toPeople.add("Phx");
        toPeople.add("Taco");
        toPeople.add("Phy");


        user1.sendMessage("Ipsum Lorem", toPeople);
        user1.sendMessage("Lorem Ipusm", toPeople);
        System.out.println();

        user1.printFromUser("Phx");
        user1.undoLastMessage();
        user1.printChatHistory();

        user2.printChatHistory();

//        ChatHistory history = new ChatHistory();
//        Message message = new Message("Message", "Timestamp");
//
//        history.addMessage(message);
//        System.out.println(history.lastMessage());
//        System.out.println(history.printFromUser("Test"));





    }
}
