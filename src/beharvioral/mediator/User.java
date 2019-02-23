package beharvioral.mediator;

public class User {
    private final String name;

    private Chatroom chatroom;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enterChatRoom(Chatroom room) {
        this.chatroom = room;
    }

    public void receiveMessage(String message, User originatedUser) {
        System.out.println("Receive message " + message + " from " + originatedUser.getName());
    }

    public void sendMessage(String message, String destinationUser) {
        chatroom.sendMessage(message, this, destinationUser);
    }
}
