public class Check {
	public int check5(int no) throws Over5Excep {
		if (no > 5) {
			throw new Over5Excep();
		}
		return no;
	}
}