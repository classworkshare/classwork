/**
 * @author You
 *
 *         �d�b�@�N���X
 */
class Phone {
	String model; 							// �@��
	String contract; 						// �_���
	String telNum; 							// �ԍ�
	int price; 								// ����
	static final String MAKER = "(��)ABC"; 	// ������Ж� (��)ABC
	static final int AT_APRICE = 10; 		// �P�ʎ��ԓ�����̉��Z�z

	/**
	 * �R���X�g���N�^ �_��Җ��Ɣԍ����󂯎��A�t�B�[���h�ɐݒ肵 �@���ݒ肷��
	 * 
	 * @param contract �_��Җ�
	 * @param telNum   �ԍ�
	 */
	Phone(String contract, String telNum) {
		this.contract = contract; 			// �_��҂�ݒ�
		this.telNum = telNum; 				// �ԍ��������ݒ�
		price = 0; 							// ����������0�ɐݒ�
		model = "PHONE-001"; 				// �@���PHONE-001�ɐݒ�
	}

	/**
	 * �u�d�b����v���\�b�h
	 * 
	 * @return void
	 */
	public void call() {
		System.out.println("�������� �| �͂��͂�");
		price = price + AT_APRICE; 			// �����ɒP�������Z
	}
}