package Day3;

public class HW4 {

	public static void main(String[] args) {
		for(int i=6; i<=9;i++) {
			System.out.println("table of "+i);
			for(int j=1;j<=10;j++) {
				int table=i*j;
				System.out.print(table+" ");
				
			}System.out.println();
		}

	}

}
/*output
table of 6
6 12 18 24 30 36 42 48 54 60 
table of 7
7 14 21 28 35 42 49 56 63 70 
table of 8
8 16 24 32 40 48 56 64 72 80 
table of 9
9 18 27 36 45 54 63 72 81 90 
 */