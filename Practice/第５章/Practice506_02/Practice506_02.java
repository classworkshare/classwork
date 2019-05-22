import java.util.ArrayList;

public class Practice506_02 {
	public static void main(String[] args) {
		ArrayList<Object> list;
		Integer intInst;
		Double doubleInst;
		
		list = new ArrayList<>();
		
		list.add("文字列");
		System.out.println("現在の要素数：" + list.size());
		
		list.add(100);
		System.out.println("現在の要素数：" + list.size());
		
		list.add(3.14);
		System.out.println("現在の要素数：" + list.size());
		
		String stringInst = (String) list.get(0);
		System.out.println(stringInst);
		Integer integ = (Integer) list.get(1);
		System.out.println(integ);
		Double dbl = (Double) list.get(2);
		System.out.println(dbl);
	}
}