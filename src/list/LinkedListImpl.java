package list;

import java.util.LinkedList;
import java.util.List;

// The data stored are linked, fast inserts/deletes at any point. Slow random access, more memory
public class LinkedListImpl {

    public  void listImpl() {
        List<String> list = new LinkedList<>();

        list.add("10");
        list.add("20");
        list.add("30");

        list.removeFirst(); // removes the first index object
        list.addFirst("30"); // add at the first index

        list.clear();
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println(list);
    }

}
