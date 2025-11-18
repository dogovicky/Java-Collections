package set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

// Just as a HashSet and LinkedHashSet, a TreeSet stores unique values but in SORTED order

// Comparator can also be used to sort custom objects
public class TreeSetImpl {

    public void treeSetImpl() {
        Set<Integer> scores = new TreeSet<>();
        Collections.addAll(scores, 70, 80, 35, 58, 27, 95, 35, 58, 79);

        scores.remove(70);
        for (int score : scores) {
            System.out.println(score);
        }

        System.out.println(scores.size());
    }

}
