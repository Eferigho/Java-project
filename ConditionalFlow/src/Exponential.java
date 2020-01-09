
public class Exponential {
	 
	private int power;
	private int base;
	private int exponential;
	//Scanner input = new Scanner(System.in);
	
	
	public void setExponential(int base, int power) {
		
		exponential = 1;
		while(power > 0) {
			exponential = exponential* base;
			power--;
		}

	}
	public int getExponential() {
		return exponential;
	}
}
