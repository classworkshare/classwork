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
			System.out.println("�L�[�{�[�h���̓G���[");
		}
		return buff;
	}
}