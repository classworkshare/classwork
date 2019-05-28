package pack1;

/**
 * @author You
 *
 *         ���[���t���X�}�[�g�t�H���N���X
 */
public class Smartphone extends Phone {
	private String mailAddress; 					// ���[���A�h���X
	private int packetPrice; 						// �p�P�b�g����
	public static final int PACKET_AT_APRICE = 1; 	// �P�p�P�b�g������̉��Z�z

	/**
	 * �R���X�g���N�^ �_��Җ��E�d�b�ԍ��E���[���A�h���X���󂯎��A
	 * �t�B�[���h�ɐݒ肷�� �_��Җ��E�d�b�ԍ��̐ݒ�͐e�̃R���X�g���N�^�ōs��
	 * �@��ɁhS_PHONE-001�h��ݒ肷��
	 * 
	 * @param contract    �_��Җ�
	 * @param telNum      �d�b�ԍ�
	 * @param mailAddress ���[���A�h���X
	 */
	public Smartphone(String contract, String telNum, String mailAddress) {
		super(contract, telNum); 					// �e�̃R���X�g���N�^�Ăяo��
		this.mailAddress = mailAddress; 			// ���[���A�h���X�ݒ�
		packetPrice = 0; 							// �p�P�b�g������0�ɐݒ�
		model = "S_PHONE-001";						// �@��ݒ�
	}

	/**
	 * ���[��������肷�郁�\�b�h
	 * 
	 * @return �p�P�b�g����
	 */
	public int mail() {
		System.out.println("���[�������܂���");
		packetPrice = packetPrice + PACKET_AT_APRICE * 5; // 5�p�P�b�g�g�p
		return packetPrice;
	}

	/**
	 * ���[���A�h���XGET���\�b�h
	 * 
	 * @return ���[���A�h���X
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * ���[���A�h���XSET���\�b�h
	 * 
	 * @return void
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	/**
	 * �p�P�b�g����GET���\�b�h
	 * 
	 * @return �p�P�b�g����
	 */
	public int getPacketPrice() {
		return packetPrice;
	}
}