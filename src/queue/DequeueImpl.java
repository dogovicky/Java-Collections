package queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * A Deque is a queue where you can add/remove from both ends.

 * Useful when:

 * you need stack + queue combo

 * processing tasks from front and back

 * implementing undo/redo
 */


public class DequeueImpl {

    /**
     * Difference between add and offer: add throws an exception when the Queue cannot accept more tasks (is full)
     * offer on the other hand returns true or false depending on whether the element was added. It never throws an error
     */

    public void dequeImpl() {
        Deque<String> messages = new LinkedList<>();

        messages.add("Message One");
        messages.add("Message  two");
        messages.add("Message Three");

        messages.offer("Message four");

        messages.addFirst("Message five"); // adds the task as the first to be processed
        messages.addLast("Message six"); // adds the task as the last to be processed

        messages.removeFirst(); // removes the first task

        System.out.println(messages);

    }

}
