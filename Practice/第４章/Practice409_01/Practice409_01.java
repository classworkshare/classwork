public class Practice409_01 {
	public static void main(String[] args) {
		
		Parent1 instParent;
		Child1 instChild;
		
		instParent = new Parent1();
		instChild = new Child1();
		
		System.out.println("�e�̃��\�b�h���Ăяo���܂��B");
		instParent.morning();
		instParent.evening();
		
		System.out.println("�q�̃��\�b�h���Ăяo���܂��B");
		instChild.morning();
		instChild.evening();
	}
}