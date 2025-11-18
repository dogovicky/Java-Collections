package set;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

// Same as HashSet, BUT maintains insertion order
public class LinkedHashSetImpl {

    public void linkedHashSetImpl() {

        Set<String> names = new LinkedHashSet<>();
        Collections.addAll(names, "Dogo", "Vicky", "John", "Doe", "Marcus", "John", "Smith");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names.size());

    }

}
