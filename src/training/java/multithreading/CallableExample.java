package training.java.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable{
	public String call(){
		System.out.println("in callable");
		return "hi";
	}
}

public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(4);
		Future f=es.submit(new MyCallable());
		System.out.println(f.get());
	}

}
