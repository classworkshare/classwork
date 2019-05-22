public class Addition {
	
	int addA;
	double addB;
	
	public void add(int value1, int value2) {
		add(value1, value2, 0);
	}
	
	public void add(int value1, int value2, int value3) {
		addA = value1 + value2 + value3;
		System.out.println(addA);
	}
	
	public void add(double value1, double value2) {
		addB = value1 + value2;
		System.out.println(addB);
	}
}