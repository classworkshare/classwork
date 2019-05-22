import java.io.*;

public class Confirm26Q3 {
	
	public static void main(String[] args) {
		
		KeyboardInput input;
		String inputStr;
		int no1, no2, work, total, start, main;
		
		input = new KeyboardInput();
		
		try {
			System.out.print("１つ目の数値を入力してください->");
			inputStr = input.inputKeyboard();
			no1 = Integer.parseInt(inputStr);
			System.out.print("２つ目の数値を入力してください->");
			inputStr = input.inputKeyboard();
			no2 = Integer.parseInt(inputStr);
			
			if (no1 > no2) {
				work = no1;
				no1 = no2;
				no2 = work;
			}
			
			start = no1;
			for (total = 0; start <= no2; start++) {
				total += start;
			}
			System.out.println("[" + no1 + "]から" + "[" + no2 + "]までの合計：" + total);
		} catch (Exception e) {
			System.out.println("数値以外が入力されました");
		}
	}
}