import java.util.ArrayList;

public class Practice506_01 {
	public static void main(String[] args) {
		ArrayList<Object> list;
		int i;
		
		list = new ArrayList<>(1);
		
		list.add("������");
		System.out.println("���݂̗v�f���F" + list.size());
		
		list.add(100);
		System.out.println("���݂̗v�f���F" + list.size());
		
		list.add(3.14);
		System.out.println("���݂̗v�f���F" + list.size());
		
		for (i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}