package beharvioral.strategy;

import java.util.List;

public class ComplexSort implements SortStrategy {
    @Override
    public void sort(List elements) {
        System.out.println("Sort using complex algorithm");
    }
}
