import pack1.Smartphone;

/**
 * @author You
 *
 *         �ˋ�̋��Z��Ԃ�\�������N���X�i���[���t���X�}�[�g�t�H���Ή��j
 */
public class YourCity {
	/**
	 * main���\�b�h
	 */
	public static void main(String[] args) {
		Smartphone she;
		int i;
		
		she = new Smartphone("�Ԏq", "080-0000-0000", "XXX@xxx.ne.jp"); // �X�}�[�g�t�H������
		
		for (i = 0; i < 3; i++) { 					// �R��d�b��������
			she.call();
		}
		
		int price = she.getPrice();
		System.out.println("�d�b����<�N���A�O>�F" + price);
		
		she.clearPrice();
		
		price = she.getPrice();
		System.out.println("�d�b����<�N���A��>�F" + price);
		
		for (i = 0; i < 5; i++) { 					// �T�񃁁[��������
			she.mail();
		}
		
		price = she.getPacketPrice();
		System.out.println("�p�P�b�g�����F" + price);
		
		String mailAddress = she.getMailAddress();
		System.out.println("���[���A�h���X<�ύX�O>�F" + mailAddress);
		
		she.setMailAddress("ZZZ@ZZZ.ne.jp");
		
		mailAddress = she.getMailAddress();
		System.out.println("���[���A�h���X<�ύX��>�F" + mailAddress);
		
		String telNum = she.getTelNum();
		System.out.println("�d�b�ԍ��F" + telNum);
		
		System.out.println("��Ж��F" + she.MAKER);
		
		String model = she.getModel();
		System.out.println("�@��F" + model);
		
		String contract = she.getContract();
		System.out.println("�_��ҁF" + contract);
	}
}