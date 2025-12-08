package collectionFramework.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		
		Queue <String> queueExample = new LinkedList<>();
		queueExample.add("one");
		queueExample.add("two");
		queueExample.add("three");
		queueExample.add("four");
		queueExample.add("five");
		queueExample.add("six");
		System.out.println(queueExample);

		queueExample.remove();
		System.out.println(queueExample);
		queueExample.remove();
		System.out.println(queueExample);
	}

}
