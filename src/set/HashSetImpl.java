package set;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// A HashSet stores unique elements with no guarantee order. No duplicates
public class HashSetImpl {

    public void hashSetImpl() {
        // Let's say we want to ensure emails are unique
        Set<String> emails = new HashSet<>();

        Collections.addAll(emails, "a@example.com",  "b@example.com", "a@example.com", "d@example.com", "e@example.com"); // only returns one @example.com

        for (String email : emails) {
            System.out.println(email);
        }

        System.out.println(emails.size());


    }

}
