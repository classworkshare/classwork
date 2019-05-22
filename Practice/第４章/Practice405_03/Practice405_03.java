public class Practice405_03 {
	public static void main(String[] args) {
		
		int i;
		int array[];
		Sort inst;
		
		array = new int[5];
		for (i = 0; i < 5; i++) {
			array[i] = Integer.parseInt(args[i]);
		}
		
		inst = new Sort();
		inst.exchange(array);
	}
}