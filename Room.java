// Yishai Baron 308396761
public class Room { //features: type, area
	private String type;
	private double area;
	public Room(String type, double area) { //constructor
		this.type = type;
		if (this.area < 0) this.area = 0;
		else 
			this.area = area;
	}
public Room(Room other) { //copy constructor
	type = other.type;
	area = other.area;
}
public String getType() { //Method Returns the name of the room
	return type;
}
public double getArea() { //Returns the area of the room
	return area;
}
public void setType(String name) { //The method sets the name of the room.
	type = name;
}
public String toString(){ //The method returns the room in string.
	return ("Room" + " type: " + type + ", " + "Area: " + area);
}

}
