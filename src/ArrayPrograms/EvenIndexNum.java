package ArrayPrograms;
import java.util.*;
public class EvenIndexNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println("i values is: "+i);
				System.out.println(arr[i]);
			}
		}

	}

}
/*
output
1
2
3
4
5
i values is: 0
1
i values is: 2
3
i values is: 4
5
*/
