package ArrayPrograms;
import java.util.*;
public class InsertElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter position of element: ");
		int position=sc.nextInt();
		System.out.println("enter value to be enter: ");
		int val=sc.nextInt();
		int arr[]=new int[5];
		System.out.println("enter element:");
		for(int i=0;i<5;i++) {
			 arr[i]=sc.nextInt();
		}
		if(position<5)
		  for(int i=0;i<5;i++) {
			 arr[position]=val;
			 System.out.println("array elements at "+i +"is "+arr[i]);
		  }
		else
			System.out.println("not valit position");
		

	}

}

/*enter position of element: 
3
enter value to be enter: 
1222
enter element:
23
25
56
45
12
array elements at 0is 23
array elements at 1is 25
array elements at 2is 56
array elements at 3is 1222
array elements at 4is 12
*/

