public class Convenience extends Arbeit {
	
	public void calculate(int hour) {
		System.out.println("コンビニで" + hour + "時間働きました。");
		wages = hour * 1000;
	}
}