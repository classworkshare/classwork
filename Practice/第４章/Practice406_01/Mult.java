public class Mult {
	int multiple;
	static int c_times = 0;
	int i_times = 0;
	
	Mult(int num) {
		multiple = num;
		System.out.println(multiple + "�{����C���X�^���X����������܂���");
	}
	
	public int calc(int value) {
		int answer;
		answer = value * multiple;
		c_times++;
		i_times++;
		return answer;
	}
	
	public void display() {
		System.out.println(multiple + "�{����C���X�^���X��");
		System.out.println("�@�C���X�^���X�ϐ��� " + i_times);
		System.out.println(multiple + "�{����C���X�^���X��");
		System.out.println("�@�N���X�ϐ��́@�@�@ " + c_times);
	}
}