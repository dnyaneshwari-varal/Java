package Multitreading.Thread1;

public class runnableTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread() +"started");
		
		try {
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName() + "execution counter #  "+i);
				Thread.sleep(100);
			}
		}catch(Exception e) {
			System.out.println("Exception in thread: "+Thread.currentThread().getName() +"Error" +e);
			

		}
		System.out.println(Thread.currentThread() +" over");

	}

}
