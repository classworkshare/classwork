public class CDshop extends Arbeit {
	
	public void calculate(int hour) {
		System.out.println("CDショップで" + hour + "時間働きました。");
		wages = hour * 850;
	}
}