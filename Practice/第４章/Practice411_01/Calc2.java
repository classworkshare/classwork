public class Calc2 implements IntfComp {
	public int add(int no1, int no2) {
		
		int tmp, cnt, sum1, sum2;
		
		// no1���������Ȃ�悤�ɓ���ւ�
		if (no1 > no2) {
			tmp = no1;
			no1 = no2;
			no2 = tmp;
		}
		
		// �K�E�X�̕��@�ō��v�����߂�
		cnt = no2 - no1 + 1;
		sum1 = no1 + no2;
		sum2 = sum1 * cnt / 2;
		
		return sum2;
	}
}