public interface Instruction {
	
	/**
	 * Process this instruction
	 * @return result of processing that instruction
	 */
	public double process();
	
	/**
	 * @return String representation of that instruction
	 */
	public String toString();
	
}