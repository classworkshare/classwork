import java.io.*;

public class Confirm26Q2 {
	
	public static void main(String[] args) {
		
		BufferedWriter buffw = null;
		KeyboardInput input;
		String name, times;
		int i;
		
		try {
			buffw = new BufferedWriter(new FileWriter("Confirm26.txt"));
			
			input = new KeyboardInput();
			
			System.out.print("���O����͂��Ă�������->");
			name = input.inputKeyboard();
			System.out.print("�񐔂���͂��Ă�������->");
			times = input.inputKeyboard();
			
			System.out.println("*** ������\�����܂� ***");
			buffw.write("*** ������\�����܂� ***");
			buffw.newLine();
			for (i = 0; i < Integer.parseInt(times); i++) {
				System.out.println(name);
				buffw.write(name);
				buffw.newLine();
			}
			System.out.println("***�\�����I�����܂���***");
			buffw.write("***�\�����I�����܂���***");
			buffw.newLine();
		} catch (IOException e) {
			System.out.println("�������݃G���[�ł�");
		} finally {
			try {
				buffw.flush();
				buffw.close();
			} catch (Exception e) {
				System.out.println("�I�������G���[�ł�");
			}
		}
	}
}