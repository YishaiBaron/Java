// Yishai Baron 308396761
// Ex3 linear  
public class Linear {
// a- The slope of the line.,
//b- The point of intersection of the line with the y-axis. 
	private double a , b; 
	private final int zero = 0, negative = -1; // final values
//The constructor will promote the values of those properties and stable.
public Linear (double a, double b) {
this.a = a;
this.b = b;
}
public Linear(Linear lin) { //Copy constructor.
	this.a = lin.a;
	this.b = lin.b;
}
//The method returns the value of the slope
public double getA() { 
	return a;
} 
//The method returns the value of the point of intersection with the y-axis.
public double getB() { 
	return b;
}
public String toString() { //Details of all special cases in 'final' print : y = ax + b 
	if (getA() == 1 && getB() < 0)	  return "y= " + "x" + getB(); //y=x +b
	if (getA() == 1 && getB() > 0)	  return "y= " + "x" + " + " + getB(); //y=x -b
	if (getA() == 1 && getB() == 0)	  return "y= " + "x"; //y=x
	if (getA() == -1 && getB() < 0)	  return "y= " + "-x" + getB(); //y=-x+b
	if (getA() == -1 && getB() > 0)	  return "y= " + "-x" + " + " + getB(); //y=-x+b
	if (getA() == -1 && getB() == 0)  return "y= " + "-x"; //y=-x
	if (getA() != 0 && getB() < 0)    return "y= " + getA() +"x"+ getB(); //y=ax -b
	if (getA() == 0 && getB() == 0)   return "y= " + zero;	//y=0
	if (getA() == 0 && getB() != 0)   return "y= " + getB(); //y=b 	
	if (getA() != 0 && getB() == 0)   return "y= " + getA() + "x";//y=ax

	//----else----, "regular" case: y = ax + b
	return "y= " + getA() + "x" + "+" + getB();
}
//The method receives the value of y and find the value of x
	public double solve(double y)		  {
		return (y - getB()) / getA();     }
// The method gets the value of x and puts it in the equation. 
//	The method returns the result of the post.
	public double assign(double x) 	   	{
		return getA()*x + getB() ;
										}
// The method will receive an object of type linear equation 
//and return the x coordinate of the intersection point of two equations.
	public double getIntersection(Linear other) {
		return ((other.getB() + getB()) / (other.getA() + getA()))*negative;
	}
// The method receives coordinates of a point in the plane - x, y - and 
// returns true if the point is in the sense described by the equation,
//and false if not.
		public boolean isOnLine(double x, double y) {
			if (y == assign(x))
				return true;
			return false;
		}
		
//The method accepts an object of type linear equation and returns 
//true if the graph of the equation other parallel graph of the equation
//is represented by this, and false if not.
		public boolean areParallel(Linear other) {
			if (other.getA() == getA())
				return true;
			return false;
	
		}
		
//The function receives the coordinates of two points in the plane,
//and returns an object that represents the type Linear straight line 
// stretched between two points.
		public Linear createLinear(double x1, double y1, double x2, double y2) {
		
			a = (y1 - y2) / (x1 - x2); //Slope x (m)
			b = (a) * (x1 * negative) + y1;		// Development straight equation: y-y1=m(x-x1)
			
			return new Linear(a , b);     //return a,b values to string
		}

		}
	
	
	
