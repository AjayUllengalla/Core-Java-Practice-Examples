package collectionFramework.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {


		Queue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(15);
		priorityQueue.add(16);
		priorityQueue.add(1);
		priorityQueue.add(5);
		priorityQueue.add(8);
		priorityQueue.add(990);
		System.out.println("Details "+priorityQueue);
		System.out.println(priorityQueue.peek());
		priorityQueue.offer(456);
		System.out.println("Details "+priorityQueue);
		priorityQueue.offer(46);
		priorityQueue.offer(11);
		priorityQueue.offer(7);
		System.out.println("Details "+priorityQueue);
		priorityQueue.offer(11);
		System.out.println("Details "+priorityQueue);
		priorityQueue.offer(12);
		priorityQueue.offer(17);
		priorityQueue.add(7);
		priorityQueue.add(5);
		System.out.println("Details "+priorityQueue);
		priorityQueue.offer(156);
		System.out.println("Details "+priorityQueue);
		System.out.println(priorityQueue.contains(12));
		
		priorityQueue.poll();
		System.out.println("Details "+priorityQueue);
	}

}
