package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Fast random access,memory efficient, Slow inserts/removals, resizing
public class ArrayListImpl{

    public void list() {

        List<String> myList = new ArrayList<String>();

        Collections.addAll(myList, "1", "2", "3");
        myList.removeFirst(); // removes the object at the index

        // accessing list items
        for (Object item : myList) {
            System.out.println(item);
        }

        myList.clear();
//        System.out.println(myList.get(0));
        System.out.println(myList.size());

    }

}
