/**
 * @author You
 *
 *         �d�b�N���X�i�A�N�Z�b�T�ǉ��j
 */
class Phone {
	protected String model; // �@��
	private String contract; // �_���
	private String telNum; // �ԍ�
	private int price; // ����
	public static final String MAKER = "(��)ABC"; // ��Ж� (��)ABC
	public static final int AT_APRICE = 10; // �P�ʎ��ԓ�����̉��Z�z

	/**
	 * �R���X�g���N�^ �_��Җ��Ɣԍ����󂯎��A�t�B�[���h�ɐݒ肵 �@���ݒ肷��
	 * 
	 * @param contract �_��Җ�
	 * @param telNum   �ԍ�
	 */
	Phone(String contract, String telNum) {
		this.contract = contract; // �_��҂�ݒ�
		this.telNum = telNum; // �ԍ��������ݒ�
		price = 0; // ����������0�ɐݒ�
		model = "PHONE-001"; // �@���PHONE-001�ɐݒ�
	}

	/**
	 * �u�d�b����v���\�b�h
	 * 
	 * @return void
	 */
	void call() {
		System.out.println("�������� �| �͂��͂�");
		price = price + AT_APRICE; // �����ɒP�������Z
	}

	/**
	 * �@��GET���\�b�h
	 * 
	 * @return �@��
	 */
	String getModel() {
		return model;
	}

	/**
	 * �ԍ�GET���\�b�h
	 * 
	 * @return �ԍ�
	 */
	String getTelNum() {
		return telNum;
	}

	/**
	 * �ԍ�SET���\�b�h
	 * 
	 * @param telNum �ݒ肷��ԍ�
	 * @return void
	 */
	void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	/**
	 * �_���GET���\�b�h
	 * 
	 * @return �_���
	 */
	String getContract() {
		return contract;
	}

	/**
	 * �_���SET���\�b�h
	 * 
	 * @param contract �_��Җ�
	 * @return void
	 */
	void setContract(String contract) {
		this.contract = contract;
	}

	/**
	 * ����GET���\�b�h
	 * 
	 * @return ����
	 */
	int getPrice() {
		return price;
	}

	/**
	 * ����CLEAR���\�b�h
	 * 
	 * @return void
	 */
	void clearPrice() {
		price = 0;
	}
}