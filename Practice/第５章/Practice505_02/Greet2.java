public class Greet2 extends Caption implements Runnable {
	String str;

	Greet2(String str) {
		this.str = str;
	}

	public void run() {
		int i;
		caption = "�C���^�[�t�F�[�X���p";
		captionDisplay();
		for (i = 0; i < 20; i++) {
			System.out.println(str);
		}
	}
}