public class Practice504_00b {
	public static void main(String[] args) {
		try {
			int iargs = Integer.parseInt(args[0]);
			int ans = 24 / iargs;
			System.out.println(ans);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException errInf) {
			System.out.println("���������ł�");
		} finally {
			System.out.println("�������I�����܂�");
		}
	}
}