public class Practice504_05 {
	public static void main(String[] args) {
		int i, result;
		Addit3 inst;
		
		inst = new Addit3();
		
		try {
			inst.add();
		} catch (Over5Excep excep1) {
			System.out.println("‚T‚ð’´‚¦‚Ü‚µ‚½");
		}
	}
}