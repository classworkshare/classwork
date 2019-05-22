public class Greet1 extends Thread {
	String str;

	Greet1(String str) {
		this.str = str;
	}

	public void run() {
		int i;
		System.out.println("Œp³—˜—p");
		for (i = 0; i < 20; i++) {
			System.out.println(str);
		}
	}
}