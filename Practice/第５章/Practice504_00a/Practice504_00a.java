public class Practice504_00a {
	public static void main(String[] args) {
		try {
			int iargs = Integer.parseInt(args[0]);
			int ans = 24 / iargs;
			System.out.println(ans);
		} catch (ArrayIndexOutOfBoundsException errInf) {
			System.out.println("引数の指定がありません");
		} catch (ArithmeticException errInf) {
			System.out.println("引数が誤りです(0は指定できません)");
		} finally {
			System.out.println("処理が完了しました");
		}
	}
}