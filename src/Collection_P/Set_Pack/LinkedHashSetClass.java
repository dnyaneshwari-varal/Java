package Collection_P.Set_Pack;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		
		System.out.println("LinkedHashSet isEmpty? "+hs.isEmpty());
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(10);
		
		System.out.println("LinkedHashSet is: "+hs);
		System.out.println("LinkedHashSet isEmpty? "+hs.isEmpty());
		
		System.out.println("LinkedHashSet contains 20? "+hs.contains(20));
		
		
		System.out.println("LinkedHashSet remove 20 "+hs.remove(20));
		
		System.out.println("LinkedHashSet size is "+hs.size());
		
		for(int a:hs) {
			System.out.println(a);
			
		}
	}

}
