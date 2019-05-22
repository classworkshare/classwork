import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practice507_02 {
	public static void main(String[] args) {
		String readData;
		
		BufferedReader buffReader = null;
		int line = 1;
		
		try {
			buffReader = new BufferedReader(new FileReader("file507_01.txt"));
			readData = buffReader.readLine();
			while (readData != null) {
				System.out.println(line + "行目：" + readData);
				line++;
				readData = buffReader.readLine();
			}
		} catch (IOException e) {
			System.out.println("読み込みエラーです");
		} finally {
			try {
				buffReader.close();
			} catch (Exception e) {
				System.out.println("終了処理エラーです");
			}
		}
	}
}