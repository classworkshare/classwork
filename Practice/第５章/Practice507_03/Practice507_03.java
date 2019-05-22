import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Practice507_03 {
	public static void main(String[] args) {
		String keyboardData;
		BufferedWriter buffWriter = null;
		KeyboardInput input;
		
		input = new KeyboardInput();
		
		try {
			buffWriter = new BufferedWriter(new FileWriter("file507_03.txt"));
			keyboardData = input.inputKeyboard();
			while (keyboardData.length() != 0) {
				buffWriter.write(keyboardData);
				buffWriter.newLine();
				keyboardData = input.inputKeyboard();
			}
		} catch (IOException e) {
			System.out.println("書込みエラーです");
		} finally {
			try {
				buffWriter.flush();
				buffWriter.close();
			} catch (Exception e) {
				System.out.println("終了処理エラーです");
			}
		}
	}
}