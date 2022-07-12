package training.java.nonaccess.modifiers;

class Vehicle 
{ 
	final int speed=10;
	
        
    Vehicle(){
    	System.out.println("default constructor from Vehicle::Parent");
    	//this.speed=30;
    }
    
   
     Vehicle(int speed){
    
    	System.out.println("parameterized constructor from Vehicle::Parent "+speed);	
    }
} 
class Car extends Vehicle 
{ 
	//int speed=10; logically available
	int speed=20;
	
    Car(){
    	// super();//optional
       // super(20);//mandatory
    	System.out.println("default constructor from Car::Child");
    }
    Car(int speed){
    	//super();//optional
    	super(20);////mandatory
    	System.out.println("parameterized constructor from Car::Child:speed");
    }
    
    void display() {
    	System.out.println("Speed::"+super.speed);
    }
} 



public class SuperDemo {

	public static void main(String[] args) {
		Car c = new Car(); 
		//Car c = new Car(10);
		c.display();
		
	}

}
