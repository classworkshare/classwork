import java.util.LinkedList;

public class StackList<E>{
	

		LinkedList<E>  list;
	
		StackList(){
			 list = new LinkedList<E>();
		}

		public int push(E element){
			list.addLast(element);
			System.out.println("’Ç‰Á‚µ‚½—v‘f:" + element);
			return list.size();
		}

		public E pop(){
			E ret = list.getLast();
			System.out.println("æ‚èo‚µ‚½—v‘f:" + ret);
			list.removeLast();
			return ret;
		}
}
