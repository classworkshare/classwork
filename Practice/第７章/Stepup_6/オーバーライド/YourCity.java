import pack1.Phone;
import pack1.Smartphone;

/**
 * @author You
 *
 *         �ˋ�̋��Z��ԃN���X�i�I�[�o�[���C�h�Ή��j
 */
class YourCity {
	/**
	 * main���\�b�h
	 */
	public static void main(String args[]) {
		Phone he;
		Smartphone she;
		int i;
		
		he = new Phone("���Y", "000-000-0000"); // �d�b����
		she = new Smartphone("�Ԏq", "090-1111-1111", "ZZZ@zzz.ne.jp"); // ���[���t���X�}�[�g�t�H������
		
		for (i = 0; i < 2; i++) { 					// he�̓d�b���Q�񂩂���
			he.call();
		}
		for (i = 0; i < 3; i++) { 					// she�̓d�b���R�񂩂���
			she.call();
		}
		
		she.mail(); 								// she�ŕ��ʂɃ��[��
		she.mail("send"); 							// she�ő��M�w��Ń��[��
		she.mail("receive"); 						// she�Ŏ�M�w��Ń��[��
		she.mail("send", 2); 						// she�łQ�ʂ̑��M�w��Ń��[��
		she.mail("receive", 3); 					// she�łR�ʂ̎�M�w��Ń��[��
		
		int price = he.getPrice();
		System.out.println("he�̓d�b���� �F" + price);
		
		price = she.getPrice();
		System.out.println("she�̓d�b�����F" + price);
		
		price = she.getPacketPrice();
		System.out.println("she�̃p�P�b�g�����F" + price);
		
		he.clearPrice(); 							// he�ŗ����N���A���\�b�h�Ăяo��
		she.clearPrice(); 							// she�ŗ����N���A���\�b�h�Ăяo��
		
		price = he.getPrice();
		System.out.println("he�̓d�b���� �F" + price);
		
		price = she.getPrice();
		System.out.println("she�̓d�b�����F" + price);
		
		price = she.getPacketPrice();
		System.out.println("she�̃p�P�b�g�����F" + price);
	}
}