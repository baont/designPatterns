package beharvioral.strategy;

import java.util.List;

public class Sorter<E> {
    private SortStrategy<E> sortStrategy;

    public Sorter(SortStrategy<E> sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(List<E> list) {
        sortStrategy.sort(list);
    }
}
