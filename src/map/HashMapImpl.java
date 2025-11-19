package map;

// A Hashmap stores key - value pairs, keys must be unique, values can repeat
// It uses a hash table
//
// Hashing converts the key → bucket index
//
// Lookup = jump directly to bucket.
// Fast inserts, deletes, and gets

import java.util.HashMap;
import java.util.Map;

/** This is why we use maps for:

retrieving students by ID

retrieving courses by courseCode

retrieving teachers by payrollNo

Anywhere you have a unique identifier → HashMap wins. **/

public class HashMapImpl {

    public void hashMapImpl() {
        Map<String, String> courses = new HashMap<>();
        courses.put("BIT 410", "Emerging issues in Computing");
        courses.put("BIT 411", "Management Information Systems");
        courses.put("BIT 411E", "Network Sensor");
        courses.put("BIT 417", "Digital Forensics");

        String course1 = courses.get("410");

        for (String key : courses.keySet()) {
            System.out.println(key);
        }

        System.out.println(courses.size());
    }

}
