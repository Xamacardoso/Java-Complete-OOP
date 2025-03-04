package DelimitedGenerics.src.model.services;

import java.util.List;

public class CalculationService {
    // <T extends Comparable> means that this method will work with any
    // T type that implements the Comparable<T> interface.
    // The <? super T> part indicates that the T type is a "T or any superclass of T".
    public static <T extends Comparable<? super T>> T max(List<T> items){
        if (items.isEmpty()) {
            throw new IllegalArgumentException("List is empty!");
        }

        T max = items.get(0);
        for (T item : items) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return max;
    }
}
