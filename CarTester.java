
public class CarTester {
	public static void main(String[] args){
		Car c= new Car();
	c.carNum =111;
	c.km=12;
	c.capacity=22;
	c.fuel=23.4;
	double amount = 20.0;
	c.refuel(amount);
	System.out.println(c.fuel);
	c.printDetails();
	System.exit(0);			
		
	}
}
