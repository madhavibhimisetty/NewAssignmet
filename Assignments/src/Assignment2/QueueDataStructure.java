package Assignment2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDataStructure {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(12);
		queue.add(14);
		queue.add(16);
		queue.add(17);
		queue.add(18);
		System.out.println(queue.remove()+"::element is removed from queue");
		System.out.println("List of elements in a Queue after removing::"+queue);
		System.out.println("Size of the queue::"+queue.size());
		System.out.println("Checking queue is empty or not::"+queue.isEmpty());
		
		
		
		
		
		
	}

	

}
