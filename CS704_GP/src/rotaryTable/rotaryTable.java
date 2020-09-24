package rotaryTable;

public class rotaryTable {
	public boolean index[] = {false, false, false, false, false, false};
	
	public void shift() {
		for (int i = 5; i > 0; i--) {
			index[i] = index[i-1];
		}
		index[0] = false;	// assuming no new bottle at pos 1
	}
	
	public void load() {
		index[0] = true;	
	}
	
	public void deload() {
		index[5] = false;
	}
	
	public void print() {
		for (int i = 0; i < 6; i++) {
			System.out.print(this.index[i] + " ");
		}
		System.out.println("");
	}

}
