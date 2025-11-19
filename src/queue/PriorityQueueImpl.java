package queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * A priority queue processes items based on priority, not arrival order

 * ✔ Highest (or lowest) priority always comes out first.

 * Internally uses a heap.

 * Real use cases:

 * scheduling highest-priority tasks first

 * sorting tasks by urgency

 * ranking students — highest score first

 * ordering notifications by criticality
 */

public class PriorityQueueImpl {

    private static class Message {
        private String message;
        private Integer priority;

        public Message(String message, int priority) {
            this.message = message;
            this.priority = priority;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public String getMessage() {
            return message;
        }

        public Integer getPriority() {
            return priority;
        }

        public String toString() {
            return "Message: " + message + " Priority: " + priority;
        }

    }

    public void priorityQueImpl() {

        PriorityQueue<Integer> tasks = new PriorityQueue<>();
        tasks.add(4);
        tasks.add(2);
        tasks.add(5);
        tasks.add(1);

        System.out.println(tasks);

        int firstPriority = tasks.poll(); // remember poll removes and returns the first item, so we remove the first item to be processed
        System.out.println(firstPriority);

        Message messageFour = new Message("Message four", 4);
        Message messageOne = new Message("Message One", 1);
        Message messageTwo = new Message("Message two", 2);

        PriorityQueue<Message> messages = new PriorityQueue<>(Comparator.comparing(Message::getPriority));
        messages.offer(messageFour);
        messages.offer(messageOne);
        messages.offer(messageTwo);

        Message firstPrio = messages.poll();
        System.out.println(firstPrio);


    }

}
