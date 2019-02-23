package beharvioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class Chatroom {
    private Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getName(), user);
        user.enterChatRoom(this);
    }

    public void sendMessage(String message, User originatedUser, String destinationUser) {
        User dest = users.get(destinationUser);
        dest.receiveMessage(message, originatedUser);
    }
}
