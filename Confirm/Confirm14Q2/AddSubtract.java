public class AddSubtract {
	
	int result;
	
	public void add(int no1, int no2) {
		result = no1 + no2;
	}
	
	public void subtract(int no1, int no2) {
		result = no1 - no2;
	}
	
	public void display() {
		System.out.println("現在の結果は[" + result + "]です");
	}
}