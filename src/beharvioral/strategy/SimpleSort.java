package beharvioral.strategy;

import java.util.List;

public class SimpleSort implements SortStrategy {
    @Override
    public void sort(List elements) {
        System.out.println("sort by simple algorithm");
    }
}
