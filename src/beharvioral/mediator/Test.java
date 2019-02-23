package beharvioral.mediator;

public class Test {
    public static void main(String[] args) {
        Chatroom room = new Chatroom();
        User me = new User("Bao");
        User you = new User("You");
        room.addUser(me);
        room.addUser(you);

        me.sendMessage("Hello", "You");
    }
}
