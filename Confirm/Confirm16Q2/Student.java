public abstract class Student {
	
	public void study(int hour) {
		System.out.println("自宅で" + hour + "時間勉強しました。");
	}

	public abstract void work(int hour);
}