public class Car {
	
	private Blackbox box;
	
	public Car() {
		box = new Blackbox();
		box.setField(10);
	}
	
	public Blackbox getBox() {
		return box;
	}
	
	public void printBox() {
		System.out.println("What is in the box? "+box.getField());
	}
	
}