public class FourArithm {
	public int calc(int val1, int val2, char type) {

		int answer;

		switch (type) {
		case '‰Á':
			answer = val1 + val2;
			break;
		case 'Œ¸':
			answer = val1 - val2;
			break;
		case 'æ':
			answer = val1 * val2;
			break;
		case 'œ':
			answer = val1 / val2;
			break;
		default:
			answer = 0;
		}
		
		return answer;
	}
}