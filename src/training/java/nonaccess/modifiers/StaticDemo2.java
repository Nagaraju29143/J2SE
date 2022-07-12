package training.java.nonaccess.modifiers;

public  class StaticDemo2 {
	
	static int x=10;
	       int y=20;

	public static void main(String[] args) {
		
		StaticDemo2 sd1=new StaticDemo2();
		sd1.x=100;
		sd1.y=200;
		
		StaticDemo2 sd2=new StaticDemo2();
		
		
		System.out.println(sd2.x +" "+sd2.y);

	}

}
