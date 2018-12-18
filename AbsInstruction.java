public class AbsInstruction implements Instruction {

	private double _a;
	
	public AbsInstruction(double a) {
		_a = a;
	}
	
	public double process() {
		if (_a < 0) return -_a;
		return _a;
	}
	
	public String toString() {
		return "|" + _a + "|";
	}

}