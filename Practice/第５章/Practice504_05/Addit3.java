public class Addit3 {
	public void add() throws Over5Excep {
		int i, result;
		Check inst;
		
		inst = new Check();
		
		for (i = 1; i <= 10; i++) {
			result = inst.check5(i);
			System.out.println(result);
		}
	}
}