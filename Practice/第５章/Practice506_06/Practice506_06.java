import java.util.ArrayList;

public class Practice506_06 {
	public static void main(String[] args) {
		GenericList<Integer> gl;
		ArrayList<Integer> list;
		
		gl = new GenericList<>();
		list = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			list.add(new Integer(i));
		}
		gl.display(list);
	}
}