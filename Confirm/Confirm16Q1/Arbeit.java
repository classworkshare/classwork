public abstract class Arbeit {
	
	int wages;

	public abstract void calculate(int hour);

	public void display() {
		System.out.println(wages + "円入手しました。");
	}
}