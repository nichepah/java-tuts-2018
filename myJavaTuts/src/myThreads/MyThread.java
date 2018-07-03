package myThreads;
/*
 * Threading using extended Thread class
 * Run method is a must
 * Create an instance and then use start() to create the thread
 * Pay attention to sleep on Thread-0; try commenting that
 */
public class MyThread extends Thread {
	public void run(){
		if(this.getName() == "Thread-0"){
			try{
				MyThread.sleep(1000,0);
			} catch( InterruptedException e){
				MyThread.currentThread().interrupt();
			}
		}
		System.out.println("My thread running..."+this.getName());
	}
}
