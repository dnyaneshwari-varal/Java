package Day3;

public class Pattern1 {

	public static void main(String[] args) {
//		int space=3;
//		for(int i=0;i<=3;i++) {
//			space--;
//			for(int j=space; j>=0;j-- ) {
//				System.out.print(" ");
//			}for(int k=0; k<=i;k++) {
//				System.out.print("* ");
//			}System.out.println(" ");
//	}
		int i,j;
		for(i=1,j=1;i<=3&&j<=3; i++,j++) {
			System.out.println(i+" "+j);
		}System.out.println(" ");
		for(i=1,j='A'; i<26&&j<'Z';i++,j++)
			System.out.println(i+" "+j);
		
	    for(i=1;(i%2==0)&&(i<=50);i++) {
	    	
	    }

	}

}
