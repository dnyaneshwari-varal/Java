package ArrayPrograms;
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int arr[]=new int[5];
	  
	  System.out.println("enter original array value: ");
	  for(int i=0;i<arr.length;i++) {
		  arr[i]=sc.nextInt();
		  //System.out.println(arr[i]);
	  }
	  System.out.println("original array value: ");
	  for(int i=0;i<arr.length;i++) {
		 
		  System.out.println(arr[i]);
	 }
	  
	  System.out.println("reverce array value: ");
	  int rev[]=new int[5];
	  for(int i=arr.length-1,j=0;i>=0;i--,j++) {
		   
			  rev[j]=arr[i];
		  
	  }
	  for(int i=0;i<arr.length;i++) {
			 
		  System.out.println(rev[i]);
	 }

	}

}
/*
 enter original array value: 
1
2
3
4
5
original array value: 
1
2
3
4
5
reverce array value: 
5
4
3
2
1

 */
