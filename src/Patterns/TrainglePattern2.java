package Patterns;
import java.util.*;
public class TrainglePattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row: ");
	    int row=sc.nextInt();
	    for(int i=1;i<=row;i++) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print(j +" ");
	    	}System.out.println();
	    }
	}

}
/*output
enter row: 
5

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
 */