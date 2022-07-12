package training.java.multithreading;

class ChildThread2 implements Runnable
{
	public void run() 
    { 
		for(int i=0;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+"- executing");
		}
    } 
}



public class JoinDemo 
{ 
  
    public static void main(String args[]) throws Exception 
    { 
        Thread t1= new Thread(new ChildThread2()); 
        t1.setName("Thread1");
        
        Thread t2= new Thread(new ChildThread2());
        t2.setName("Thread2");
        
        t1.start();
        t1.join(); 
        
        t2.start();
        
   } 
} 