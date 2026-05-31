package MapPack;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<>();
		
		hs.put(1, "Dnyana");
		hs.put(2, "Hanu");
		hs.put(3, "Prem");
		hs.put(4, "januuu");
		
		System.out.println("HashMap is: "+hs);
		
		
		System.out.println(hs.get(2));
		System.out.println(hs.remove(2));
		System.out.println("HashMap is: "+hs);
		
		System.out.println("HashMap size is: "+hs.size());
		
		System.out.println("contains key 1 in HashMap: "+hs.containsKey(1));

		System.out.println("contains value dnyana in HashMap: "+hs.containsValue("Dnyana"));
	}

}
