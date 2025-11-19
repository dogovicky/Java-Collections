package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1️⃣ What a Queue Is (Simple + Practical)

 * A Queue is a data structure that processes elements in order of arrival.

 * Think of:

 * people lining up for food

 * students joining a help-desk queue

 * background jobs in a processor

 * HTTP requests going through middleware

 * Official behavior:

 * ✔ FIFO — First In, First Out

 * Example:
 * 1st added → 1st removed
 * 2nd added → 2nd removed

 * 2️⃣ Why Queues Matter in Backend Development

 * Queues appear everywhere in real systems:

 * ✔ Background tasks

 * SMS sending

 * Email notifications

 * Processing attendance logs

 * Generating report cards

 * File uploads

 * Batch database updates

 * ✔ Asynchronous processing

 * If you don’t want the API to block while doing heavy work, you put tasks in a queue.

 * ✔ Scheduling

 * Cron tasks → queued → executed in order.

 * ✔ Message brokers

 * RabbitMQ, Kafka, and Redis Streams = queues under the hood.
 */

public class LinkedListQueue {

    public void linkedListQueueImpl() {
        Queue<String> tasks = new LinkedList<>();

        tasks.offer("Generate report");
        tasks.offer("Send SMS");

        for (String task : tasks) {
            System.out.println(task);
        }

        System.out.println(tasks);

        String task2 = tasks.peek(); //returns first item without removing
        System.out.println(task2);

        String t = tasks.poll(); // removes and returns first item
        System.out.println(t);

        System.out.println(tasks);

    }

}
