package training.java.multithreading;

class ChildThread1 implements Runnable
{
	public void run(){
		for(int i=0;i<=10;i++){
            try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
 
			System.out.println("child thread");
		}
	}
}
public class SleepDemo {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new ChildThread1());
		t1.start();
		
		
		for(int i=0;i<=10;i++){
			System.out.println("main thread");
		}

	}

}
