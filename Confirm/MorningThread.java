public class MorningThread extends Thread {
	
	String str;
	
	MorningThread(String str) {
		this.str = str;
	}
	
	public void run() {
		int i;
		
		for (i = 0; i < 20; i++) {
			System.out.println(str + "F" + i);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				
			}
		}
	}
}