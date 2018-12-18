public class MulInstruction implements Instruction {

	private double _a;
	private double _b;
	
	public MulInstruction(double a, double b) {
		_a = a;
		_b = b;
	}
	
	public double process() {
		return _a * _b;
	}

	public String toString() {
		return _a + " * " + _b;
	}
	
}
