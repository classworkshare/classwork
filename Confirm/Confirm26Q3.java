import java.io.*;

public class Confirm26Q3 {
	
	public static void main(String[] args) {
		
		KeyboardInput input;
		String inputStr;
		int no1, no2, work, total, start, main;
		
		input = new KeyboardInput();
		
		try {
			System.out.print("�P�ڂ̐��l����͂��Ă�������->");
			inputStr = input.inputKeyboard();
			no1 = Integer.parseInt(inputStr);
			System.out.print("�Q�ڂ̐��l����͂��Ă�������->");
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
			System.out.println("[" + no1 + "]����" + "[" + no2 + "]�܂ł̍��v�F" + total);
		} catch (Exception e) {
			System.out.println("���l�ȊO�����͂���܂���");
		}
	}
}