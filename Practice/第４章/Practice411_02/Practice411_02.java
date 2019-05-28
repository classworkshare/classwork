public class Practice411_02 {
	public static void main(String[] args) {
		
		ChocolateCake cake1;
		StrawberryCake cake2;
		
		cake1 = new ChocolateCake();
		cake2 = new StrawberryCake();
		
		cake1.body();
		cake1.decorate();
		cake2.body();
		cake2.decorate();
	}
}