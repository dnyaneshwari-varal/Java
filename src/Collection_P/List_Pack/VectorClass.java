package Collection_P.List_Pack;

import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
		
		System.out.println(v.firstElement());
		
		System.out.println(v.lastElement());
		
				
		
		
		

		

		
	}
}
