package Multitreading.TypeOfCreatingThread;

public class UseSleepMethod extends Thread {

	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Run t1 with thread class");
			
			try {
//				Thread.sleep(9000);
				 Thread.sleep(3000);
				
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
				
			}
		}
	}
	public static void main(String[] args) {
		
		UseSleepMethod t1=new UseSleepMethod();
		t1.start();
		
	}


}
