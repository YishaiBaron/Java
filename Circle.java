// Yishai Baron 308396761
public class Circle {
	private double centerX,centerY,radius;  //declaring the attributes of the circle
	private final double RADIUS_UNIT = 1,TWO = 2,PI = Math.PI; // final values

	public Circle(){  	// a unit circle constructor
		centerX = 0;
		centerY = 0;
		radius = RADIUS_UNIT;
	}

	public Circle(double x, double y, double r) { 	//a constructor that sets a value to all the circle's attributes
		centerX	= x;	
		centerY =  y;
		if(r <= 0)
			radius=RADIUS_UNIT;
		else
			radius=r;
	}

	public void setCenterX(double x){ 	//method that enables to set a value to CenterX 
		centerX = x;
	}	
	public void setCenterY(double y){ 	//method that enables to set a value to CenterY 
		centerY = y;
	}	
	public void setRadious(double r){ 	//method that enables to set a value to radius
		if(r <= 0)
			radius=RADIUS_UNIT;
		else
			radius = r;
	}
	public double getCenterX() { 	//method that enables to get the value of CenterX 
		return centerX; 
	}
	public double getCenterY() {  //method that enables to get the value of CenterY
		return centerY;
	}

	public double getRadius() {  	//method that enables to get the value of radius
		return radius;
	}

	public String toString() { 	//this method returns a string of the circle's coordinates and radius
		String a = "Circle at ("; 
		String b = ", ";
		String c = ") radius ";
		return a + centerX + b + centerY + c + radius;
	}

	public double area() { 	//this method returns the area of the circle
		return PI * Math.pow (radius, TWO);
	}

	public double perimeter() { 	//this method returns the circumference of the circle
		return TWO * PI * radius;
	}

	public void resize (double factor) { 	//this method enlarges the circle by multiplying its radius by a given number(factor)
		if (factor > 0)
			radius *= factor;
	}
	
	public void moveTo(double x, double y){ //this method changes the circles location by altering its coordinates
		centerX = x;
		centerY = y;
	}

	public boolean isIn(double x, double y){ 	//this method determines whether a given point is found within the circle's area (or on its circumference)
		if(Math.pow((centerX-x), TWO)+Math.pow((centerY-y), TWO)<=Math.pow(PI, TWO))
			return true;
		else 
			return false;
	}
}