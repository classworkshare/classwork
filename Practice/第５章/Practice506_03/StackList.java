import java.util.LinkedList;

public class StackList<E> {
	LinkedList<E> list;

	StackList() {
		list = new LinkedList<>();
	}

	public int push(E element) {
		list.addLast(element);
		System.out.println("�ǉ������v�f�F" + element);
		return list.size();
	}

	public E pop() {
		E ret = list.getLast();
		System.out.println("���o�����v�f�F" + ret);
		list.removeLast();
		return ret;
	}
}