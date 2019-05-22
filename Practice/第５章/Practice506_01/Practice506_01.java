import java.util.ArrayList;

public class Practice506_01 {
	public static void main(String[] args) {
		ArrayList<Object> list;
		int i;
		
		list = new ArrayList<>(1);
		
		list.add("文字列");
		System.out.println("現在の要素数：" + list.size());
		
		list.add(100);
		System.out.println("現在の要素数：" + list.size());
		
		list.add(3.14);
		System.out.println("現在の要素数：" + list.size());
		
		for (i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}