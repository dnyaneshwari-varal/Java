package Day3;
//print prime number from 1 to 100
public class HW2 {

	public static void main(String[] args) {
	
		for(int i=2;i<=100;i++) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0)
					count++;
			}
			
			if(count==2) {
				System.out.println("prime num "+i);
			}
			
		}

	}

}
/*output 
prime num 2
prime num 3
prime num 5
prime num 7
prime num 11
prime num 13
prime num 17
prime num 19
prime num 23
prime num 29
prime num 31
prime num 37
prime num 41
prime num 43
prime num 47
prime num 53
prime num 59
prime num 61
prime num 67
prime num 71
prime num 73
prime num 79
prime num 83
prime num 89
prime num 97
*/
