package beharvioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);

        Sorter<Integer> sorter = new Sorter<>(new SimpleSort());
        sorter.sort(ints);
    }
}
