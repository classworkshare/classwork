public class Practice504_02 {
	public static void main(String[] args) {
		int x, result;
		Addit2 inst;
		
		inst = new Addit2();
		
		for (x = 1; x <= 10; x++) {
			try {
				result = inst.add(x);
				System.out.println(result);
			} catch (Over50Excep excep1) {
				System.out.println("50オーバーエラーをcatchしました！\n");
			} catch (Over25Excep excep1) {
				System.out.println("25オーバーエラーをcatchしました！\n");
			}
		}
	}
}