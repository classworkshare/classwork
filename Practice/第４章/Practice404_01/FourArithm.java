public class FourArithm {
	public int calc(int val1, int val2, char type) {

		int answer;

		switch (type) {
		case '��':
			answer = val1 + val2;
			break;
		case '��':
			answer = val1 - val2;
			break;
		case '��':
			answer = val1 * val2;
			break;
		case '��':
			answer = val1 / val2;
			break;
		default:
			answer = 0;
		}
		
		return answer;
	}
}