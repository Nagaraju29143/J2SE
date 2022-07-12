package training.java.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo {

	public static void main(String[] args) {

	ExecutorService	executorService=Executors.newFixedThreadPool(10);
	
	List<Callable<String>> callables=new ArrayList<Callable<String>>();
	
	callables.add(new Callable<String>()
			{
				@Override
				public String call() {
					String s=null;
					try {
					s.length();
					s= "call client check webservice";
					}catch(Exception e) {
						e.printStackTrace();
					}
				return 	s;
				}
			});
	callables.add(new Callable<String>()
	{
		@Override
		public String call() throws Exception {
			
			return "call kyc check webservice";
		}
	});
	
	try {
		List<Future<String>> futures=executorService.invokeAll(callables);
		for(Future<String> future :futures) {
			System.out.println(future.get());
		} 
		
	} catch (InterruptedException | ExecutionException e) {
		e.printStackTrace();
	}
	
	}

}
