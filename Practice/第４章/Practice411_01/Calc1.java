public class Calc1 implements IntfComp {
	public int add(int no1, int no2) {
		
		int i, tmp, sum;
		
		// no1が小さくなるように入れ替え
		if (no1 > no2) {
			tmp = no1;
			no1 = no2;
			no2 = tmp;
		}
		
		// ループで合計を求める
		sum = 0;
		for (i = no1; i <= no2; i++) {
			sum = sum + i;
		}
		
		return sum;
	}
}