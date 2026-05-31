package MapPack;

import java.util.LinkedHashMap;

public class LinkedHashMapClass {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> lm=new LinkedHashMap<>();
		
		lm.put(1, "Dnyana");
		lm.put(2, "Hanu");
		lm.put(3, "Prem");
		lm.put(4, "januuu");
		
		System.out.println("LinkedHashMap is: "+lm);
		
		
		System.out.println(lm.get(2));
		System.out.println(lm.remove(2));
		System.out.println("LinkedHashMap is: "+lm);
		
		System.out.println("LinkedHashMap size is: "+lm.size());
		
		System.out.println("contains key 1 in LinkedHashMap: "+lm.containsKey(1));

		System.out.println("contains value dnyana in LinkedHashMap: "+lm.containsValue("Dnyana"));
	}

}
