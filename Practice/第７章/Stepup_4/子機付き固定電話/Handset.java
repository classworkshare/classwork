package pack1;

/**
 * @author You
 *
 *         �q�@�t���Œ�d�b�N���X
 */
public class Handset extends Phone {
	private int handsetNo; 							// �q�@��

	/**
	 * �R���X�g���N�^ �_��Җ��E�d�b�ԍ��E�q�@�����󂯎��A�t�B�[���h�ɐݒ肷��
	 * �_��Җ��E�d�b�ԍ��̐ݒ�͐e�̃R���X�g���N�^�ōs��
	 * �Ō�ɋ@��ɁhHANDSET-001�h��ݒ肷��
	 * 
	 * @param contract  �_��Җ�
	 * @param telNum    �d�b�ԍ�
	 * @param handsetNo �q�@��
	 */
	public Handset(String contract, String telNum, int handsetNo) {
		super(contract, telNum); 					// �e�̃R���X�g���N�^�ďo��
		this.handsetNo = handsetNo; 				// �q�@���̐ݒ�
		this.model = "HANDSET-001"; 				// �@��̐ݒ�
	}

	/**
	 * �����d�b�������郁�\�b�h �q�@���ȏ�̔ԍ����n���ꂽ��G���[��\������
	 * 
	 * @param handsetExtens �q�@�ԍ�
	 * @return void
	 */
	public void extens(int handsetExtens) {
		if (handsetExtens > handsetNo) {
			System.out.println("���̔ԍ��̎q�@�͂���܂���");
		} else {
			System.out.println(handsetExtens + "�Ԃ̎q�@�Ɠ����ʘb���܂���");
		}
	}

	/**
	 * �q�@��GET���\�b�h
	 * 
	 * @return �q�@��
	 */
	public int getHandsetNo() {
		return handsetNo;
	}

	/**
	 * �q�@��SET���\�b�h
	 * 
	 * @return void
	 */
	public void setHandsetNo(int handsetNo) {
		this.handsetNo = handsetNo;
	}
}