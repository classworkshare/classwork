public class Cumulation {
	
	int sum = 0;
	int no;
	
	public Cumulation(int no) {
		this.no = no;
	}
	
	public void add() {
		sum = sum + no;
		System.out.println("sum=" + sum);
	}
}