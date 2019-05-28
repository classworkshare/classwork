import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {
	String buff = null;
	BufferedReader inputKB;
	
	public String inputKeyboard() {
		inputKB = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			buff = inputKB.readLine();
		} catch (IOException e) {
			System.out.println("KBÉGÉâÅ[");
		}
		return buff;
	}
}