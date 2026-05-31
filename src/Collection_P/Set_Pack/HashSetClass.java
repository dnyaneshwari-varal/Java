package Collection_P.Set_Pack;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<>();
		
		System.out.println("Hashset isEmpty? "+hs.isEmpty());
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(10);
		
		System.out.println("Hashset is: "+hs);
		System.out.println("Hashset isEmpty? "+hs.isEmpty());
		
		System.out.println("Hashset contains 20? "+hs.contains(20));
		
		
		System.out.println("Hashset remove 20 "+hs.remove(20));
		
		System.out.println("Hashset size is "+hs.size());
		
		for(int a:hs) {
			System.out.println(a);
			
		}
		
		
		
		
		
	}

}
