public class GetParam {
	String getKeyin(String showMsg) {
		String keyboardData;
		System.out.print(showMsg);
		KeyboardInput input = new KeyboardInput();
		keyboardData = input.inputKeyboard();
		return keyboardData;
	}
}