import java.util.LinkedList;
	
public class QueueList<T> {
	
	LinkedList<T> list;
	
	QueueList() {
		list = new LinkedList<T>();
	}
	
	public int enqueue(T element) {
		list.addLast(element);
		System.out.println("�ǉ������v�f�F" + element);
		return list.size();
	}
	
	public T dequeue() {
		T ret = list.getFirst();
		System.out.println("���o�����v�f�F" + ret);
		list.removeFirst();
		return ret;
	}
}