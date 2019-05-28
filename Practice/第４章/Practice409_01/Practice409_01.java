public class Practice409_01 {
	public static void main(String[] args) {
		
		Parent1 instParent;
		Child1 instChild;
		
		instParent = new Parent1();
		instChild = new Child1();
		
		System.out.println("親のメソッドを呼び出します。");
		instParent.morning();
		instParent.evening();
		
		System.out.println("子のメソッドを呼び出します。");
		instChild.morning();
		instChild.evening();
	}
}