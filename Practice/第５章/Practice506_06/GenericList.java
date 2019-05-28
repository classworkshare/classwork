import java.util.ArrayList;

public class GenericList<E> {
	public void display(ArrayList<E> list) {
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i));
		}
	}
}