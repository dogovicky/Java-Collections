package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {

    public static void show() {

        // Working with independent collections
        Collection<String> collection = new ArrayList<>();

        // Working with group collections
        Collections.addAll(collection, "a", "b", "c");

//        collection.remove("a"); removes object 'a' from the collection
//        collection.clear();  clears collection
        System.out.println(collection.size());

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection == other);
        System.out.println(collection.equals(other));

    }

}
