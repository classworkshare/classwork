import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Practice507_01 {
	public static void main(String[] args) {
		String writeData;
		BufferedWriter buffWriter = null;
		
		try {
			buffWriter = new BufferedWriter(new FileWriter("file507_01.txt"));
			writeData = "こんにちは";
			buffWriter.write(writeData);
			buffWriter.newLine();
			writeData = "Ｊａｖａの勉強は";
			buffWriter.write(writeData);
			buffWriter.newLine();
			writeData = "進んでいますか？";
			buffWriter.write(writeData);
			buffWriter.newLine();
		} catch (IOException e) {
			System.out.println("書き込みエラーです");
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