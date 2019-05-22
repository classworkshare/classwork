import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KeyboardInput {
	String buff = null;
	BufferedReader buffKeyboard;

	public String inputKeyboard() {
		buffKeyboard = new BufferedReader(new InputStreamReader(System.in));
		try {
			buff = buffKeyboard.readLine();
		} catch (IOException e) {
			System.out.println("キーボード入力エラー");
		}
		return buff;
	}
}