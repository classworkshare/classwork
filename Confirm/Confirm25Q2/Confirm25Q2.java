public class Confirm25Q2 {
	
	public static void main(String[] args) {
		
		QueueList < Integer > quelist;
		StackList < Integer > stacklist;
		int i;
		
		quelist = new QueueList < Integer > ();
		stacklist = new StackList < Integer > ();
		
		//�f�[�^�̊i�[�i�R�v�f�j
		System.out.println("�L���[�Ƀf�[�^��ǉ����܂�");
		quelist.enqueue(1);
		quelist.enqueue(2);
		quelist.enqueue(3);
		
		System.out.println("�X�^�b�N�Ƀf�[�^��ǉ����܂�");
		stacklist.push(1);
		stacklist.push(2);
		stacklist.push(3);
		
		//�f�[�^�̎��o��
		System.out.println("�L���[����f�[�^�����o���܂�");
		for (i = 0; i < 3; i++) {
			quelist.dequeue();
		}
		
		System.out.println("�X�^�b�N����f�[�^�����o���܂�");
		for (i = 0; i < 3; i++) {
			stacklist.pop();
		}
	}
}