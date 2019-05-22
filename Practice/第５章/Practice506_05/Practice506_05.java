import java.util.ArrayList;

public class Practice506_05 {
	public static void main(String[] args) {
		ArrayList<Integer> list;
		
		list = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			list.add(new Integer(i));
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i));
		}
	}
}