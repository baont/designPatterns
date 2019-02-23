package beharvioral.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class FamilyIterator implements Iterator<String> {
    private List<String> data;
    private int currentIdex;

    public FamilyIterator(List<String> data) {
        this.data = data;
        currentIdex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIdex < data.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            return data.get(currentIdex++);
        } else {
            throw new NoSuchElementException("No more element");
        }
    }
}
