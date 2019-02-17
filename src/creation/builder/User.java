package creation.builder;

public class User {

    public static void main(String[] args) {
        DoorBuilder builder = new DoorBuilder().color(10).w(1).h(2);
        Door door = builder.build();
        System.out.println(door);
    }
}
