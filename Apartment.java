// yishai baron 308396761
public class Apartment {//features:
private String family; // family name
private int flat; //  Represents the floor on which the apartment is located
private int numOfRooms; // Number of rooms in apartment
private Room firstRoom, secondRoom, thirdRoom;  //Rooms in a row

public Apartment(String name, int flat){ //The constructor initializes the family name and the floor.
	if (this.flat<0) this.flat = 0;
	else this.flat = flat;
	this.flat=flat;
	this.family=name;
	firstRoom = null; 
	secondRoom = null;
	thirdRoom = null;
	numOfRooms = 0;		
}
public String getFamily() { //Returns the name of the family
	return family;
}
public int getFlat() { //Returns the number of floors of the house.
return flat;
}

public Room getRoomByType(String type) { //If there is no 'type' room, the method returns null.
	if (firstRoom!=null && (firstRoom.getType()).equals(type)){
		return (new Room (firstRoom));
	}
	else if (secondRoom!=null && (secondRoom.getType()).equals(type)){
		return (new Room (secondRoom));
	}
	else if (thirdRoom!=null && (thirdRoom.getType()).equals(type)){
		return (new Room (thirdRoom));
	}
	else
		return null;
}
public int getNumOfRooms() {//Returns the number of rooms in the house.
	return numOfRooms;
}
public void setRoom(Room r) {//The method will copy one room apartment object r
	if(firstRoom == null){
		firstRoom = new Room (r);
		numOfRooms++;
	}
	else if(secondRoom == null){
		secondRoom = new Room (r);
		numOfRooms++;
	}
	else if(thirdRoom == null){
		thirdRoom = new Room (r);
		numOfRooms++;
	}
}
public double getTotalArea() {//The method returns the area of the apartment.
	double areaSum =0; 
	if(firstRoom != null){
		areaSum += firstRoom.getArea();
	}
	if(secondRoom != null){
		areaSum += secondRoom.getArea();
	}
	if(thirdRoom != null){
		areaSum += thirdRoom.getArea();
	}
	return areaSum;
}
public String toString() {//The method returns a string that represents the apartment
	String s = family + "'s " + "apartment " + ", flat " + flat
			+ " has " + numOfRooms + " rooms";
			if (firstRoom != null){
				s+= "\n" + firstRoom.toString();
			}
			if (secondRoom != null){
				s+= "\n" + secondRoom.toString();
			}
			if (thirdRoom != null){
				s+= "\n" + thirdRoom.toString();
			}
			return s;
}

}