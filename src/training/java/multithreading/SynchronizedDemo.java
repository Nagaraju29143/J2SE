package training.java.multithreading;

// Here static synchronized  method=synchronized(Display.class)
class Display{
	
	//t1,t2,t3
	public  static synchronized void  printTable(int n) throws InterruptedException{
		
		for(int i=1;i<=5;i++){
			 System.out.println(Thread.currentThread().getName()+":"+n*i);
			 Thread.sleep(1000);
			  
		}
		
			
         
		  //System.out.println("logic1");
			
			/*synchronized(Display.class) {
				for(int i=1;i<=5;i++){
					 System.out.println(Thread.currentThread().getName()+":"+n*i);
					 Thread.sleep(1000);
					  
				}
			}*/
		
	}
	
	//t2,t3 can not access
   public synchronized void  m1() throws InterruptedException{
	   
		for(int i=0;i<2;i++){
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+":"+"in m1() ");
		}
		
	}
   
   //t2,t3 can access
   public  void  m2() throws InterruptedException{
	   
		for(int i=0;i<2;i++){
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+":"+"in m2() ");
		}
		
	}
}

class MyThread1 extends Thread{
	Display d;
	
	public MyThread1(Display d) {
		this.d = d;
	}

	//t1,t2,t3
	public void run(){
		try {
			d.printTable(5); //t1,t2,t3
			d.m1(); //t1,t2,t3
			d.m2(); //t1,t2,t3
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		
		Display d1=new Display();
		
		MyThread1 t1=new MyThread1(d1);
		MyThread1 t2=new MyThread1(d1);
		MyThread1 t3=new MyThread1(d1);
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		
		t1.start();
		t2.start();
		t3.start();
		
		/*Display d2=new Display();
		
		MyThread1 t4=new MyThread1(d2);
		MyThread1 t5=new MyThread1(d2);
		MyThread1 t6=new MyThread1(d2);

		t4.setName("Thread4");
		t5.setName("Thread5");
		t6.setName("Thread6");
		
		
		t4.start();
		t5.start();
		t6.start();*/
		

	}

}
