package GenericsExample.src.model.services;

import java.util.ArrayList;
import java.util.List;

// This <T> right here is called Generic.
// It parametrizes this class, providing type safety, code reuse,
// better performance and readability without having to modify the
// entire class to add new types functionalities.
public class PrintService <T> {
    private List<T> items;

    public PrintService() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public T first(){
        if (items.isEmpty()) {
            throw new IllegalStateException("The list is empty");
        }
        return items.get(0);
    }

    public void print() {
        if (items.isEmpty()){
            throw new IllegalStateException("There are no items to print");
        }

        System.out.print("[");
        System.out.print(items.get(0));
        for (int i = 1 ; i < items.size() ; i++) {
            System.out.print(", " + items.get(i));
        }
        System.out.println("]");
    }
}
