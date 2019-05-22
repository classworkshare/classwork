public class Mult {
	int multiple;
	static int c_times = 0;
	int i_times = 0;
	
	Mult(int num) {
		multiple = num;
		System.out.println(multiple + "倍するインスタンスが生成されました");
	}
	
	public int calc(int value) {
		int answer;
		answer = value * multiple;
		c_times++;
		i_times++;
		return answer;
	}
	
	public void display() {
		System.out.println(multiple + "倍するインスタンスの");
		System.out.println("　インスタンス変数は " + i_times);
		System.out.println(multiple + "倍するインスタンスの");
		System.out.println("　クラス変数は　　　 " + c_times);
	}
}