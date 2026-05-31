package Collection_P.Set_Pack;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		
		ts.add(40);
		ts.add(60);
		ts.add(40);
		ts.add(20);
		ts.add(15);
		
		System.out.println("TreeSet is: "+ts);
		
		ts.remove(20);
		System.out.println("after remove 20 TreeSet is: "+ts);
	    System.out.println(	"20 present in treeset?: "+ts.contains(20));
	    System.out.println(	"60 present in treeset?: "+ts.contains(60));
	    System.out.println("hashcode of 1st element "+ts.hashCode());
	    
	    System.out.println("1st element is "+ts.first());
	    System.out.println("last element is "+ts.last());
	    System.out.println("last element is "+ts.getLast());
	    
	    
	    
		

	}

}
