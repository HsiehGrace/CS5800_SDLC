package Memento_Mediator;

import java.time.Clock;
import java.util.ArrayList;

public class ChatServer {

    ArrayList<User> users;
    ArrayList<ArrayList<String>> blockedLists;

    Clock clock = Clock.systemUTC();

    ChatServer(){
        users = new ArrayList<>();
        blockedLists = new ArrayList<>();
    }
    // Mediator Class

    // Register User
    public User addUser(String username){
        User newUser = new User(username, this);
        blockedLists.add(new ArrayList<>());
        users.add(newUser);

        return newUser;
    }

    // Unregister User
    public void removeUser(User user){
        blockedLists.remove(users.indexOf(user));
        users.remove(user);
    }

    // Blocker is person that does not want messages from the person being blocked
    public void blockUser(User blocker, String blocked){
        blockedLists.get(users.indexOf(blocker)).add(blocked);
    }

    public String sendMessage(User sender, String newMessage, ArrayList<String> recipients){

        String timestamp = clock.instant().toString();
        Message message = new Message(sender.getUsername(), newMessage, timestamp, recipients);

        for (String recipient : recipients)
        {
            User tempUser = new User(recipient, this);
            if(users.contains(tempUser)) {
                users.get(users.indexOf(tempUser)).recieveMessage(message);
                System.out.println("Message sent from " + sender.getUsername() + " to " + recipient);
            }

        }

        return timestamp;
    }

    public void removeMessage(MessageMemento message){

        Message tempMessage = new Message(message);
        for(User user: users){
            if(user.removeMessage(tempMessage)){
                System.out.println("Message removed from " + user.getUsername());
            }
        }
        System.out.println();

    }
}
