public class Confirm26Q1 {
	
	public static void main(String[] args) {
		
		KeyboardInput input;
		String name, times;
		int i;
		
		input = new KeyboardInput();
		
		System.out.print("���O����͂��Ă�������->");
		name = input.inputKeyboard();
		System.out.print("�񐔂���͂��Ă�������->");
		times = input.inputKeyboard();
		
		System.out.println("*** ������\�����܂� ***");
		for (i = 0; i < Integer.parseInt(times); i++) {
			System.out.println(name);
		}
		System.out.println("***�\�����I�����܂���***");
	}
}