package Collection_P.List_Pack;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> lst=new LinkedList<>();
		
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		
		System.out.println("Linkedlist is: "+lst);
		
		
		lst.addFirst(1);
		System.out.println("add first Linkedlist is: "+lst);
		lst.addLast(50);
		System.out.println("add last Linkedlist is: "+lst);
		
		lst.removeFirst();
		System.out.println("remove first Linkedlist is: "+lst);
		
		lst.removeLast();
		System.out.println("remove Last Linkedlist is: "+lst);
		
		System.out.println(	lst.getFirst());
		
	    System.out.println(	lst.getLast());
		
	    
		
		

	}

}
