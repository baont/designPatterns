package beharvioral.iterator;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashSet<String> members = new HashSet<>();
        members.add("Arthur");
        members.add("Molly");
        members.add("Bill");
        members.add("Charlie");
        members.add("Percy");
        members.add("Fred");
        members.add("George");
        members.add("Ron");
        members.add("Ginny");
        Family family = new Family(members);

        while (family.iterator().hasNext()) {
            System.out.println(family.iterator().next());
        }
    }
}
