import java.util.LinkedList;
	
public class QueueList<T> {
	
	LinkedList<T> list;
	
	QueueList() {
		list = new LinkedList<T>();
	}
	
	public int enqueue(T element) {
		list.addLast(element);
		System.out.println("追加した要素：" + element);
		return list.size();
	}
	
	public T dequeue() {
		T ret = list.getFirst();
		System.out.println("取り出した要素：" + ret);
		list.removeFirst();
		return ret;
	}
}