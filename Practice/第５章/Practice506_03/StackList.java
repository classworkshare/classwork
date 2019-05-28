import java.util.LinkedList;

public class StackList<E> {
	LinkedList<E> list;

	StackList() {
		list = new LinkedList<>();
	}

	public int push(E element) {
		list.addLast(element);
		System.out.println("追加した要素：" + element);
		return list.size();
	}

	public E pop() {
		E ret = list.getLast();
		System.out.println("取り出した要素：" + ret);
		list.removeLast();
		return ret;
	}
}