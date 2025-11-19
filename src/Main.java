import collections.CollectionsDemo;
import list.ArrayListImpl;
import list.LinkedListImpl;
import map.HashMapImpl;
import map.LinkedHashMapImpl;
import map.TreeMapImpl;
import queue.DequeueImpl;
import queue.LinkedListQueue;
import queue.PriorityQueueImpl;
import set.HashSetImpl;
import set.LinkedHashSetImpl;
import set.TreeSetImpl;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Iterable & Iterator interface and how they work
//        var list = new GenericList<String>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//
//        for (var item : list) {
//            System.out.println(item);
//        }
//
//        // Collections
//        CollectionsDemo.show();


       // List: ArrayList and LinkedList
        ArrayListImpl arrListImpl = new ArrayListImpl();
        //arrListImpl.list();

        LinkedListImpl linkedListImpl = new LinkedListImpl();
        //linkedListImpl.listImpl();

        // Set:  HashSet, LinkedHashSet and TreeSet

        HashSetImpl hashSet = new HashSetImpl();
//        hashSet.hashSetImpl();

        LinkedHashSetImpl linkedHashSet = new LinkedHashSetImpl();
//        linkedHashSet.linkedHashSetImpl();

        TreeSetImpl treeSet = new TreeSetImpl();
//        treeSet.treeSetImpl();

        // Map: HashMap, LinkedHashMap and TreeMap
        HashMapImpl hashMap = new HashMapImpl();
//        hashMap.hashMapImpl();

        LinkedHashMapImpl linkedHashMap = new LinkedHashMapImpl();
//        linkedHashMap.linkedHashMapImpl();

        TreeMapImpl treeMap = new TreeMapImpl();
//        treeMap.treeMapImpl();

        LinkedListQueue listQueue = new LinkedListQueue();
        listQueue.linkedListQueueImpl();

        DequeueImpl dequeue = new DequeueImpl();
        dequeue.dequeImpl();

        PriorityQueueImpl priorityQueue = new PriorityQueueImpl();
        priorityQueue.priorityQueImpl();
    }
}