
public class Confirm05Q2 {

	public static void main(String[] args) {
		int[] array = new int[4];
		array[0] = 100;
		array[1] = 200;
		array[2] = array[0] + array[1];
		array[3] = array[2] * 2;
		
		for(int w : array) {
			System.out.println(w);
		}
	}

}
