public class Calculator {
	
	// Array that holds all the instructions
	private Instruction[] _instructions;
	
	/**
	 * Constructor
	 * @param instructions Array with list of instructions to process
	 */
	public Calculator(Instruction[] instructions) {
		_instructions = instructions;
	}
	
	/**
	 * Prints the result of calculating all the instructions 
	 */
	public void calculateAll() {
		for(int i=0; i < _instructions.length; i++) {
			System.out.println(_instructions[i].toString() + " = " + _instructions[i].process());
		}
	}

}