package Multitreading.TypeOfCreatingThread;

class MyThread extends Thread {

    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {

        for(int i=1; i<=5; i++) {

            System.out.println(name + " : " + i);

            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {

            }
        }
    }



    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}