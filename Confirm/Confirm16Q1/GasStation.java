public class GasStation extends Arbeit {
	
	public void calculate(int hour) {
		System.out.println("スタンドで" + hour + "時間働きました。");
		wages = hour * 1000 + 500;
	}
}