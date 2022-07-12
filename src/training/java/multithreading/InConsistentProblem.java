package training.java.multithreading;

class Test{
	
	//t1,t2
	public   void print(int n) throws Exception {
		
		//System.out.println(Thread.currentThread().getName()+": common logic executed");
		
		synchronized(Test.class) {
		   for(int i=1;i<=n;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			//Thread.sleep(1000);
			Test.class.wait(1000);
			}
		} 
	}
	
	/*public synchronized void  m1() {
		   
				System.out.println("from m1");
		
	}
	
	public  void  m2(){
		   
		System.out.println("from m2");
	}*/
}

class Sample implements Runnable{
	
	Test t;
	
	public Sample(Test t){
		this.t=t;
	}
	
	//t1,t2
	public void run() {
		try {
		t.print(5);
		//t.m1();
		//t.m2();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class InConsistentProblem {

	public static void main(String[] args) {
		Sample s1=new Sample(new Test());
		
		Thread t1=new Thread(s1);
		t1.setName("thread1");
		t1.start();
		
		Thread t2=new Thread(s1);
		t2.setName("thread2");
		t2.start();
		
		
		/*Sample s2=new Sample(new Test());
		
		Thread t3=new Thread(s2);
		t3.start();
		
		Thread t4=new Thread(s2);
		t4.start();*/

	}

}
