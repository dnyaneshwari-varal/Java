package Collection_P.Queue_Pack;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q=new PriorityQueue<>();
		//add element in queue
		q.offer(30);
		q.offer(20);
		q.offer(10);
		q.offer(50);
		
		System.out.println("Queue is: "+q);
		
		//delete element
		System.out.println("deleted element is "+q.poll());
		System.out.println("Queue is: "+q);
		
	
		//get 1st element
		System.out.println("top element is "+q.peek());
		System.out.println("Queue is: "+q);
	}

}
