import pack1.Smartphone;

/**
 * @author You
 *
 *         �ˋ�̋��Z��ԃN���X�i�I�[�o�[���[�h�Ή��j
 */
class YourCity {
	/**
	 * main���\�b�h
	 */
	public static void main(String[] args) {
		Smartphone she;
		int i;
		she = new Smartphone("�Ԏq", "090-0000-0000", "ZZZ@zzz.ne.jp"); // ���[���t���X�}�[�g�t�H������
		she.mail(); 								// �ʏ�̌Ăяo��
		she.mail("send"); 							// ���M�̌Ăяo��
		she.mail("receive"); 						// ��M�̌Ăяo��
		she.mail("send", 3); 						// �R�ʑ��M�̌Ăяo��
		she.mail("receive", 3); 					// �R�ʎ�M�̌Ăяo��
		int price = she.getPacketPrice();
		System.out.println("�p�P�b�g�����F" + price);
	}
}