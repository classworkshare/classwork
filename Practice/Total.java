
public class Total extends Display{

	int answer, i;
	
	public int arithm(int val){
		answer = 0;
		for(i = 1 ; i <= val ; i++) {
			answer += i;
		}
		return answer;
	}

}
