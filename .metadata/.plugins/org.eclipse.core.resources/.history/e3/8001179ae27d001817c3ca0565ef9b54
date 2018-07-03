package myThreads;
/*
 * Demonstrates threads using classes
 * and then using
 * Runnable
 */
public class ThreadDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using MyThread class	
		MyThread myThread = new MyThread();
		myThread.start();
		MyThread myThread1 = new MyThread();
		myThread1.start();
		
		// Using Runnable using MyRunnable class
		System.out.println("---Runnable Implementation---");
		MyRunnable myRunnable = new MyRunnable();
		// Pass the runnable with run to the class
		Thread thread = new Thread(myRunnable);
		thread.start();
		
		// Multi-thread demo using NewThread class
		new NewThread("One");
		new NewThread("Two");
		new NewThread("Three");
		new NewThread("Four");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Main thread interrupted");
		} // wait till the threads complete execution
	
		System.out.println("Main thread exiting");
	}

}
