package pack1;

import pack3.Camera;

/**
 * @author You
 *
 *         �J�����t���X�}�[�g�t�H���N���X �@
 */
public class CameraSmartphone1 extends SmartphoneGame1 implements Camera {
	/**
	 * �R���X�g���N�^ �_��Җ��E�d�b�ԍ��E���[���A�h���X���󂯎��A
	 * �t�B�[���h�ɐݒ肷�� �����ɂ�鍀�ڂ̐ݒ�͐e�̃R���X�g���N�^�ōs��
	 * �@��ɁhCAMERA-001�h��ݒ肷��
	 * 
	 * @param contract    �_��Җ�
	 * @param telNum      �d�b�ԍ�
	 * @param mailAddress ���[���A�h���X
	 */
	public CameraSmartphone1(String contract, String telNum, String mailAddress) {
		super(contract, telNum, mailAddress); 		// �e�̃R���X�g���N�^�ďo
		model = "CAMERA-001";
	}

	/**
	 * �J�����B�e���\�b�h
	 * 
	 * @return void
	 */
	public void takePicture() {
		System.out.println("�V���b�^�[���w�J�V���b�x�Ɛ؂�܂���");
	}
}