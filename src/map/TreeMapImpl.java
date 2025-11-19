package map;

import java.util.Map;
import java.util.TreeMap;

/**
 * A TreeMap is a sorted Map.

 * Keys are stored in natural order (1,2,3 or A,B,C…)

 * OR your custom Comparator

 * Internally uses a Red-Black Tree (balanced tree)

 * ✔ Operations

 * Get → O(log n)

 * Put → O(log n)

 * Remove → O(log n)

 * So you trade a bit of speed (compared to HashMap)
 * for sorted keys always.

 * 2️⃣ Why Use TreeMap

 * Use TreeMap when:

 * ✔ You need sorted output

 * (e.g., alphabetical, ascending, descending)

 * ✔ You need range-based queries

 * like:

 * all students with IDs < X

 * all fees between certain ranges

 * all classes alphabetically from “Form 2” to “Form 4”

 * ✔ You need predictable ordering for navigation

 * (e.g., .firstKey(), .lastKey(), .higherKey(), .lowerKey())
 */

public class TreeMapImpl {

    public void treeMapImpl() {
        Map<String, String> students = new TreeMap<>();
        students.put("SIT-101", "John Doe");
        students.put("COM-101", "Smith Jane");
        students.put("SIK-101", "James Mick");
        students.put("SIT-102", "Name One");

        System.out.println(students);

        students.remove("SIT-102"); // removes the object mapped by the key

        students.get("COM-101"); // returns the value mapped by the key

        boolean isAvailable = students.containsKey("SIT-102"); // returns a boolean value if the key is available or not

        boolean isEmpty = students.isEmpty(); // returns true if the Map is empty

        for (String key : students.keySet()) {
            System.out.println(key);
        }

        students.clear(); // clears the Map
    }

}
