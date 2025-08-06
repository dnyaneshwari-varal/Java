package Day3;
//find armstrong number from 100 to 1000
public class HW3 {

	public static void main(String[] args) {
		int rem;
		
		for(int i=100; i<=1000; i++) {
			int count=0;
			int temp1=i;
			int res2=0;
			for(int temp=i; temp>0;temp/=10) {
			
				count++;
			
			}
			for(int temp=i;temp>0;temp/=10) {
				rem=temp%10;
			
			
			 int power=1;
			 for(int k=1; k<=count;k++) {
				
				
				power=power*rem;
				
			 }
			res2=res2+power;
			//temp1/=10;
			}
			if(temp1==res2)
				System.out.println(temp1+" is armstrong number");
			
			
		}

	}

}
