public class Practice506_03 {
	public static void main(String[] args) {
		StackList<Integer> instA;
		int i;
		
		instA = new StackList<>();
		instA.push(1);
		instA.push(2);
		instA.push(3);
		
		for (i = 0; i < 3; i++) {
			instA.pop();
		}
	}
}