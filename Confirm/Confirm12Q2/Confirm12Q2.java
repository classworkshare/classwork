public class Confirm12Q2 {
	public int distribution[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	public static void main(String[] args) {
		Confirm12Q2 instA, instB;
		int i;
		
		instA = new Confirm12Q2();
		instB = new Confirm12Q2();
		
		instA.randomNum();
		instB.randomNum();
		
		for (i = 0; i < 10; i++) {
			System.out.print("[" + i + "]‚ªo‚½‰ñ”F");
			System.out.println(instA.distribution[i] + instB.distribution[i]);
		}
	}

	public void randomNum() {
		int ret, i;
		
		for (i = 0; i < 10; i++) {
			ret = (int) (Math.random() * 10);
			distribution[ret]++;
		}
	}
}