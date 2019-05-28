public class Addit2 {
	private int result = 0;

	public int add(int no) throws Over25Excep, Over50Excep {
		result = result + no;
		if (result > 50) {
			throw new Over50Excep();
		}
		if (result > 25) {
			throw new Over25Excep();
		}
		return result;
	}
}