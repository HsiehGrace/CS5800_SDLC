package Memento_Mediator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ChatHistoryTest extends ChatHistory {

    ChatHistory history;
    Message message;

    @BeforeEach
    void setUp() {
        history = new ChatHistory();
        message = new Message("Message", "Timestamp");
    }

    @Test
    void testAddMessage() {
        history.addMessage(message);
        assertEquals("[null\nTimestamp: Message]",history.toString());
    }

    @Test
    void testLastMessage() {
        history.addMessage(message);
        assertEquals("null\nTimestamp: Message",history.lastMessage().toString());
    }

    @Test
    void testRemoveMessage() {
        history.addMessage(message);
        history.removeMessage(message);
        assertEquals("[]", history.toString());
    }

}