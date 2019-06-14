import java.util.ArrayList;

public class Confirm25Q3 {
	
	public static void main(String[] args) {
		ArrayList < Object > list;
		
		list = new ArrayList < Object > ();
		
		list.add(new ConfirmClass1(10));
		list.add(new ConfirmClass2(20));
		list.add(new ConfirmClass3());
		
		ConfirmClass1 class1 = (ConfirmClass1) list.get(0);
		System.out.println("確認クラス１のval：" + class1.val);
		ConfirmClass2 class2 = (ConfirmClass2) list.get(1);
		System.out.println("確認クラス２のval：" + class2.getVal());
		ConfirmClass3 class3 = (ConfirmClass3) list.get(2);
		class3.display();
	}
}