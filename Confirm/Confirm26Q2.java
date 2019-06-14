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
			
			System.out.print("名前を入力してください->");
			name = input.inputKeyboard();
			System.out.print("回数を入力してください->");
			times = input.inputKeyboard();
			
			System.out.println("*** 今から表示します ***");
			buffw.write("*** 今から表示します ***");
			buffw.newLine();
			for (i = 0; i < Integer.parseInt(times); i++) {
				System.out.println(name);
				buffw.write(name);
				buffw.newLine();
			}
			System.out.println("***表示を終了しました***");
			buffw.write("***表示を終了しました***");
			buffw.newLine();
		} catch (IOException e) {
			System.out.println("書き込みエラーです");
		} finally {
			try {
				buffw.flush();
				buffw.close();
			} catch (Exception e) {
				System.out.println("終了処理エラーです");
			}
		}
	}
}