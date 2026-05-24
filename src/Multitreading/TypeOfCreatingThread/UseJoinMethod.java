package Multitreading.TypeOfCreatingThread;

public class UseJoinMethod extends Thread{
	
	
	public void run() {
		for(int i=0;i<=6;i++) {
			System.out.println("in thread: "+i);
			
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		UseJoinMethod obj=new UseJoinMethod();
		UseJoinMethod obj2=new UseJoinMethod();
		obj.start();
		obj.join();
		obj2.start();
		obj2.join();
		
		System.out.println("Main end ");
		
	}

}
