package Multitreading.Thread1;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());//main thread
		
		runnableTask task=new runnableTask();
		Thread t1=new Thread(task,"one");
		Thread t2=new Thread(task,"two");
		Thread t3=new Thread(task,"three");
		Thread t4=new Thread(task,"four");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"exec counter "+i);
			Thread.sleep(200);
		}
		System.out.println("Main over");

	}

}
