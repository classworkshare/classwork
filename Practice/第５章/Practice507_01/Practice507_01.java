import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Practice507_01 {
	public static void main(String[] args) {
		String writeData;
		BufferedWriter buffWriter = null;
		
		try {
			buffWriter = new BufferedWriter(new FileWriter("file507_01.txt"));
			writeData = "����ɂ���";
			buffWriter.write(writeData);
			buffWriter.newLine();
			writeData = "�i�������̕׋���";
			buffWriter.write(writeData);
			buffWriter.newLine();
			writeData = "�i��ł��܂����H";
			buffWriter.write(writeData);
			buffWriter.newLine();
		} catch (IOException e) {
			System.out.println("�������݃G���[�ł�");
		} finally {
			try {
				buffWriter.flush();
				buffWriter.close();
			} catch (Exception e) {
				System.out.println("�I�������G���[�ł�");
			}
		}
	}
}