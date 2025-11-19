package map;

// A LinkedHashMap is just a HashMap + linked list that remembers the order in which entries were added.

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Use LinkedHashMap when you want:

 * fast lookup (like HashMap)

 * AND predictable iteration order

 * So it combines:

 * O(1) average get/put

 * + ordered iteration

 * 2️⃣ When to Use It

 * Use LinkedHashMap when you need:

 * ✔ Order of insertion

 * e.g., dashboard sections in a specific order

 * ✔ Order of access

 * LinkedHashMap can also reorder on .get() calls (LRU caches)

 * ✔ Deterministic API responses

 * Stable JSON order improves readability

 * ✔ Very stable mapping for configs, routing tables, etc.
 */

public class LinkedHashMapImpl {

    public void linkedHashMapImpl() {

        Map<Integer, String> subjects = new LinkedHashMap<>();
        subjects.put(3, "Sciences");
        subjects.put(2, "Languages");
        subjects.put(4, "Humanities");
        subjects.put(1, "Mathematics");

        subjects.remove(1); // removes an object from the Map, you use key to remove the value

        subjects.get(4); // returns the value of the key specified

        boolean isAvailable = subjects.containsKey(1); // returns true / false, if the key is either available or not

        subjects.clear(); // clears the map

        System.out.println(subjects);
        for (String value : subjects.values()) {
            System.out.println(value);
        }

    }

}
