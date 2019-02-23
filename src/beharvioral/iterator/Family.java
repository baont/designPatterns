package beharvioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Family implements Iterable<String> {
    private Set<String> members;
    private FamilyIterator iterator;

    public Family(Set<String> members) {
        this.members = members;
        iterator = new FamilyIterator(new ArrayList<>(members));
    }

    @Override
    public Iterator<String> iterator() {
        return iterator;
    }
}
