package ArrayPrograms;
//search element in array
import java.util.*;
public class SearchElement {
	static  int findElement(int[] arr,int num) {
		int count=0;
		
		for(int i=0;i<5;i++) {
			if(arr[i]==num) { 
				//System.out.println(num+" num pesent in array");
				count++;
			}
//			else
//				count2++;
		}return count;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter search elements: ");
		int num=sc.nextInt();
		int[] arr=new int[5];
		System.out.println("enter array elements: ");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int result=findElement(arr,num);
		if(result !=0)
			System.out.println(num+" num pesent in array");
		else
			System.out.println(num+" num not pesent in array");
	}
	

}


//output
/*enter search elements: 
3
enter array elements: 
1
2
3
3
4
3 num pesent in array*/