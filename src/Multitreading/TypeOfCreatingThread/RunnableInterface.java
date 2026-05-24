package Multitreading.TypeOfCreatingThread;

public class RunnableInterface implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("1st thread");
		}
		
	}
	public static void main(String[] str) {
		RunnableInterface obj=new RunnableInterface();
		Thread t1=new Thread(obj);
		t1.start();
	}
}
