package training.java.multithreading;

class ChildThread implements Runnable
{
	public void run(){
		
		for(int i=0;i<=100;i++){
			 // Control passes to main thread
			Thread.yield();
            // After execution of main Thread child thread takes over
			System.out.println("child thread");
		}
	}}

public class YieldDemo {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new ChildThread());
		t1.setPriority(5);
		t1.start();
		
		Thread.currentThread().setPriority(10);//main thread
		//main thread related logic
		for(int i=0;i<=100;i++){
			System.out.println("main thread");
		}
	}

}
