/**
 * @author You
 *
 *         �ˋ�̋��Z��Ԃ�\�������N���X�i�A�N�Z�b�T�Ή��j
 */
class YourCity {
	/**
	 * main���\�b�h
	 */
	public static void main(String[] args) {
		Phone he;
		int i;
		he = new Phone("���Y", "000-000-0000"); // he�̓d�b����
		for (i = 0; i < 3; i++) { // he�̓d�b���R�񂩂���
			he.call();
		}
		int price = he.getPrice(); // �d�b�����擾
		System.out.println("�d�b����<�N���A�O>�F" + price);
		he.clearPrice(); // �d�b�����N���A
		price = he.getPrice();
		System.out.println("�d�b����<�N���A��>�F" + price);
		String telNum = he.getTelNum(); // �d�b�ԍ��擾
		System.out.println("�d�b�ԍ�<�ύX�O>�F" + telNum);
		he.setTelNum("222-222-2222"); // �d�b�ԍ��ݒ�
		telNum = he.getTelNum();
		System.out.println("�d�b�ԍ�<�ύX��>�F" + telNum);
		System.out.println("��Ж��F" + he.MAKER); // ��Ж��\��
		String model = he.getModel(); // �@��擾�E�\��
		System.out.println("�@��F" + model);
		String contract = he.getContract(); // �_��Ҏ擾�E�\��
		System.out.println("�_��ҁF" + contract);
	}
}