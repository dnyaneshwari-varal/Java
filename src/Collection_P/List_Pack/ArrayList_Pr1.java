package Collection_P.List_Pack;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Pr1 {
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("ArrayList Is: "+ list);
		System.out.println("ArrayList size: "+ list.size());
		
		System.out.println(list.get(1));
		
		list.remove(1);
		System.out.println("ArrayList after remove: "+ list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list.add(60);
		list.add(70);
		list.add(80);
		list.addAll(1, list2);
		System.out.println("ArrayList Is: "+ list);
		
		list.set(1,100);
		System.out.println("ArrayList Is: "+ list);
		Collections.sort(list);
		System.out.println("ArrayList Is: "+ list);
	}
	
	
	
	
}
