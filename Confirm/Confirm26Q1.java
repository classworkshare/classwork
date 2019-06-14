public class Confirm26Q1 {
	
	public static void main(String[] args) {
		
		KeyboardInput input;
		String name, times;
		int i;
		
		input = new KeyboardInput();
		
		System.out.print("名前を入力してください->");
		name = input.inputKeyboard();
		System.out.print("回数を入力してください->");
		times = input.inputKeyboard();
		
		System.out.println("*** 今から表示します ***");
		for (i = 0; i < Integer.parseInt(times); i++) {
			System.out.println(name);
		}
		System.out.println("***表示を終了しました***");
	}
}