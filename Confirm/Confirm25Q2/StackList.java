import java.util.LinkedList;

public class StackList<E>{
	

		LinkedList<E>  list;
	
		StackList(){
			 list = new LinkedList<E>();
		}

		public int push(E element){
			list.addLast(element);
			System.out.println("�ǉ������v�f:" + element);
			return list.size();
		}

		public E pop(){
			E ret = list.getLast();
			System.out.println("���o�����v�f:" + ret);
			list.removeLast();
			return ret;
		}
}
