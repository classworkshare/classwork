public class Addit1 {
	private int result = 0;

	public int add(int no) throws Over25Excep {
		result = result + no;
		if (result > 25) {
			throw new Over25Excep();
		}
		return result;
	}
}