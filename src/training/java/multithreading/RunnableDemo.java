package training.java.multithreading;


class MyRunnable  implements Runnable{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("child thread");
		}
	}
}

public class RunnableDemo {

	public static void main(String[] args) {
		System.out.println("*****main method*****"); //main thread created
		
		Thread t1=new Thread(new MyRunnable());
		
		t1.start(); //t1 thread created
		
		for(int i=0;i<=10;i++){
			System.out.println("main thread");
		}
		
	}

}
