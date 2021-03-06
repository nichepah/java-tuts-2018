package myThreads;

public class NewThread implements Runnable{
	
	String name;  // name of the thread
	Thread t; 
	
	// constructor assigns name
	// and starts the thread
	public NewThread(String threadName) {
		// TODO Auto-generated constructor stub
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New Thread " + t);
		t.start(); // start the thread
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=5; i>0; i--){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(name +"child thread interrupted");
			}
		}
		System.out.println(name + "Exiting");
	}

}
