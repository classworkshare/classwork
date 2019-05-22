public class Greet2 extends Caption implements Runnable {
	String str;

	Greet2(String str) {
		this.str = str;
	}

	public void run() {
		int i;
		caption = "インターフェース利用";
		captionDisplay();
		for (i = 0; i < 20; i++) {
			System.out.println(str);
		}
	}
}