package training.java.multithreading;

class MyThread extends Thread{
	public void run(){
		//System.out.println("Child Thread priority: "+Thread.currentThread().getPriority());
		
		for(int i=0;i<=100;i++){
			System.out.println("child thread");
		}
	}
}


public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("*****main method*****"); //main thread created
		
		MyThread t1=new MyThread();
		t1.setPriority(10);
		t1.start(); //t1 thread created
		
		Thread.currentThread().setPriority(5);//main thread
		//System.out.println("Main Thread priority: "+Thread.currentThread().getPriority());
		
		//main thread related logic
		for(int i=0;i<=100;i++){
			System.out.println("main thread");
		}
	}

}
