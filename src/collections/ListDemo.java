package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void show() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
        list.add(0, "1");

        System.out.println(list.subList(0, 2)); // for is inclusive but to is exclusive
    }

}
