public class Confirm25Q2 {
	
	public static void main(String[] args) {
		
		QueueList < Integer > quelist;
		StackList < Integer > stacklist;
		int i;
		
		quelist = new QueueList < Integer > ();
		stacklist = new StackList < Integer > ();
		
		//データの格納（３要素）
		System.out.println("キューにデータを追加します");
		quelist.enqueue(1);
		quelist.enqueue(2);
		quelist.enqueue(3);
		
		System.out.println("スタックにデータを追加します");
		stacklist.push(1);
		stacklist.push(2);
		stacklist.push(3);
		
		//データの取り出し
		System.out.println("キューからデータを取り出します");
		for (i = 0; i < 3; i++) {
			quelist.dequeue();
		}
		
		System.out.println("スタックからデータを取り出します");
		for (i = 0; i < 3; i++) {
			stacklist.pop();
		}
	}
}