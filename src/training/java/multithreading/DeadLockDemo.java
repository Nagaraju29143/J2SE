package training.java.multithreading;

//https://www.youtube.com/watch?v=JLuFhNdmafc
//https://www.javatpoint.com/how-to-avoid-deadlock-in-java
public class DeadLockDemo {

	public static void main(String[] args) {

		 Object obj1 = "Object1";
		 Object obj2 = "Object2";
		 
		 try {

		Thread t1 = new Thread() {
			public void run() {
				synchronized (obj1) {
					System.out.println("Thread1 locked obj1");
					try {
						Thread.sleep(100);
					} catch (Exception ex) {

					}
					
					synchronized (obj2) {
						System.out.println("Thread1 locked obj2");
					}
				}

				

			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (obj2) {
					System.out.println("Thread2 locked obj2");
					try {
						Thread.sleep(100);
					} catch (Exception ex) {

					}
					
					synchronized (obj1) {
						System.out.println("Thread2 locked obj1");
					}
				}

				

			}
		};
		
		t1.start();
		t1.join();
		t2.start();
		
		 }catch(Exception ex) {
			 
		 }

	}

}
