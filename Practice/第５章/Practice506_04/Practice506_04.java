import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class Practice506_04 {
	public static void main(String[] args) {
		HashMap<Integer, String> data = new HashMap<>();
		int[] length = { 143, 194, 213, 322, 367, 249, 268 };
		String[] name = { "}ãì", "]Ìì", "V³ì", "ªì", "MZì", "Åãì", "Îëì" };
		
		// HashMapÉf[^ðÇÁ·é
		for (int i = 0; i < length.length; i++) {
			data.put(length[i], name[i]);
		}
		
		// L[lðwèµÄf[^ðæ¾·é
		System.out.println("L[F" + 213);
		System.out.println("l@F" + data.get(213));
		System.out.println(); // üs
		
		// Ce[^ðpµS\¦·é
		System.out.println("S\¦");
		Iterator it = data.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry set = (Map.Entry) it.next();
			System.out.println(set.getValue() + "\t" + set.getKey() + "km");
		}
	}
}