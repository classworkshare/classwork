public class Calc1 implements IntfComp {
	public int add(int no1, int no2) {
		
		int i, tmp, sum;
		
		// no1���������Ȃ�悤�ɓ���ւ�
		if (no1 > no2) {
			tmp = no1;
			no1 = no2;
			no2 = tmp;
		}
		
		// ���[�v�ō��v�����߂�
		sum = 0;
		for (i = no1; i <= no2; i++) {
			sum = sum + i;
		}
		
		return sum;
	}
}