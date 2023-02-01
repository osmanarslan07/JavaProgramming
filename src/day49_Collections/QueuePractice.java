package day49_Collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue= new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("priorityQueue = " + priorityQueue);

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("linkedList = " + linkedList);

        System.out.println("-----------------------------------");
        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);
        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);
        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);
        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);

    }

}
