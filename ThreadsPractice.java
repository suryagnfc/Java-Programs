
public class ThreadsPractice {

/*
 * you can subdivide specific operations within a single application into 
 * individual threads that all run in parallel.
 * The following diagram shows the life-cycle of a thread.
 * 
 * 		  Start()-> Runnable ----run() -----> Running
 * New Thread()  NEW/							/  \
 * 				   /  /<-----END of execution/  	\	
 * 				  DEAD 							 \
 * 					  \<------ Waiting<--- sleep(), wait()
 * 
 * Priority of thread range from 1-10, by default it is set to 5 and can be changed
 * by using setPriority()
 * 
 * There are 2 ways to create a thread.
 * 1. Extend the Thread class
 * Inherit from the Thread class, override its run() method, and write the 
 * functionality of the thread in the run() method.
 * Then you create a new object of your class and call it's start method to
 * run the thread.
 * 
 * 2. other way to creating Threads is implementing the Runnable interface
 * Implement the run() method. then, Create a new Thread object, pass the Runnable class to its constructor, and start the
 * Thread by calling the start() method.
 * 
 * 
 * Thread.sleep(1000); pauses the thread for one second but throws an InterruptedException, so it should be surrounded with a try/catch block
 * Code will not compile when then 
 */
	
	public static void main(String[] args) {
		//Method 1 to start a thread
		System.out.println("Creating the Object of Loader class and starting its thread");
		Loader obj = new Loader();
		obj.start(); //When start() is called the run() method statements execute on a different thread.
		
		//Method 2 to start a thread
		Thread t = new Thread(new Loader2());
		t.start();
		try{
			t.sleep(1000);	
		}
		catch (InterruptedException e)
		{
			System.out.println("Exception" + e.toString());
		}
		
	}
	
}

//Method 1 to create a thread
class Loader extends Thread
{
	public void run()
	{
		System.out.println("Method 1 of creating and running a thread");
	}
}

//Method 2 to create a thread
class Loader2 implements Runnable{
	public void run(){
		System.out.println("Method 2 of creating and runnung a Thread");
	}
}