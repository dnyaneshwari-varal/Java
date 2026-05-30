package Collection_P.List_Pack;



import java.util.ArrayList;
import java.util.Collections;

public class ArrayListString {
	
	
	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Dnyanesh");
		list.add("Hanu");
		list.add("Shivani");
		list.add("Gauri");
		System.out.println("ArrayList Is: "+ list);
		System.out.println("ArrayList size: "+ list.size());
		
		System.out.println(list.get(1));
		
		list.remove(1);
		System.out.println("ArrayList after remove: "+ list);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("shubzz");
		list2.add("Janu");
		list2.add("diksha");
		list.addAll(1, list2);
		System.out.println("ArrayList Is: "+ list);
		
		list.set(1,"Prajuu");
		System.out.println("ArrayList Is: "+ list);
		Collections.sort(list);
		System.out.println("ArrayList Is: "+ list);
	}
	
	
	
	
}
