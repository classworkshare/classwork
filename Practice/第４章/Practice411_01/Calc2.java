public class Calc2 implements IntfComp {
	public int add(int no1, int no2) {
		
		int tmp, cnt, sum1, sum2;
		
		// no1が小さくなるように入れ替え
		if (no1 > no2) {
			tmp = no1;
			no1 = no2;
			no2 = tmp;
		}
		
		// ガウスの方法で合計を求める
		cnt = no2 - no1 + 1;
		sum1 = no1 + no2;
		sum2 = sum1 * cnt / 2;
		
		return sum2;
	}
}