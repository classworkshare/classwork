import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class Practice506_04 {
	public static void main(String[] args) {
		HashMap<Integer, String> data = new HashMap<>();
		int[] length = { 143, 194, 213, 322, 367, 249, 268 };
		String[] name = { "筑後川", "江の川", "天竜川", "利根川", "信濃川", "最上川", "石狩川" };
		
		// HashMapにデータを追加する
		for (int i = 0; i < length.length; i++) {
			data.put(length[i], name[i]);
		}
		
		// キー値を指定してデータを取得する
		System.out.println("キー：" + 213);
		System.out.println("値　：" + data.get(213));
		System.out.println(); // 改行
		
		// イテレータを利用し全件表示する
		System.out.println("＊全件表示＊");
		Iterator it = data.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry set = (Map.Entry) it.next();
			System.out.println(set.getValue() + "\t" + set.getKey() + "km");
		}
	}
}