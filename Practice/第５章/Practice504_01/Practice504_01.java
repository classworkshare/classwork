public class Practice504_01 {
	public static void main(String[] args) {
		int i, result;
		Addit1 inst;
		
		inst = new Addit1();
		
		for (i = 1; i <= 10; i++) {
			try {
				result = inst.add(i);
				System.out.println(result);
			} catch (Over25Excep except1) {
				System.out.println("25�I�[�o�[�G���[��catch���܂����I");
				System.out.println("");
			} finally {
				System.out.println(i + " ��ڂ�finally�����s���܂����I");
			}
		}
	}
}