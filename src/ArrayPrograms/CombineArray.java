package ArrayPrograms;
//combine 2narrays in one array
public class CombineArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=new int[] {12,14,20,17,18};
		int arr2[]=new int[] {1,2,3,4,5};
		int arr3[]=new int[10];
//		int i=0;
//		if(i<10) {
//			for(int k=0;k<5;k++) {
//				arr3[i]=arr1[k];
//				i++;
//			}
//			
//			for(int k=0;k<5;k++) {
//				arr3[i]=arr2[k];
//				i++;
//				}
//		}
		int i;
		for(i=0;i<5;i++) 
			arr3[i]=arr1[i];
		
//		for(int i=5,j=0;i<10;i++,j++) 
//			arr3[i]=arr2[j];
		
		//or
		for(int j=0;j<5;i++,j++) {
			arr3[i]=arr2[j];
		}
		
		System.out.println("combine array is: ");
		for(int j=0;j<10;j++) {
			System.out.println(arr3[j]);
		}
	}

}




/*
 output
 combine array is: 
12
14
20
17
18
1
2
3
4
5
*/
