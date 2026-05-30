package Collection_P.Queue_Pack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue_ArrayDeque {

	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<>();
		
		dq.add(20);
		dq.add(30);
		dq.add(40);
		
		System.out.println("Deque is: "+dq);
		
		dq.addFirst(10);
		System.out.println("addFirst Deque is: "+dq);
		
		dq.addLast(50);
		System.out.println("addLast Deque is: "+dq);
		
		dq.removeFirst();
		System.out.println("removeFirst Deque is: "+dq);
		
		dq.removeLast();
		System.out.println("removeLast Deque is: "+dq);
		
		System.out.println("top element in Deque is: "+dq.peekFirst());
		
		System.out.println("bottom element in Deque is: "+dq.peekLast());
		
	}

}
