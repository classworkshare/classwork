public class Practice504_00a {
	public static void main(String[] args) {
		try {
			int iargs = Integer.parseInt(args[0]);
			int ans = 24 / iargs;
			System.out.println(ans);
		} catch (ArrayIndexOutOfBoundsException errInf) {
			System.out.println("�����̎w�肪����܂���");
		} catch (ArithmeticException errInf) {
			System.out.println("���������ł�(0�͎w��ł��܂���)");
		} finally {
			System.out.println("�������������܂���");
		}
	}
}