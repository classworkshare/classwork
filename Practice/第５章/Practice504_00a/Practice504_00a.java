public class Practice504_00a {
	public static void main(String[] args) {
		try {
			int iargs = Integer.parseInt(args[0]);
			int ans = 24 / iargs;
			System.out.println(ans);
		} catch (ArrayIndexOutOfBoundsException errInf) {
			System.out.println("ˆø”‚Ìw’è‚ª‚ ‚è‚Ü‚¹‚ñ");
		} catch (ArithmeticException errInf) {
			System.out.println("ˆø”‚ªŒë‚è‚Å‚·(0‚Íw’è‚Å‚«‚Ü‚¹‚ñ)");
		} finally {
			System.out.println("ˆ—‚ªŠ®—¹‚µ‚Ü‚µ‚½");
		}
	}
}