package pack1;

import pack3.Camera;

/**
 * @author You
 *
 *         �J�����t���X�}�[�g�t�H���N���X �A
 */
public class CameraSmartphone2 extends SmartphoneGame2 implements Camera {
	/**
	 * �R���X�g���N�^ �_��Җ��E�d�b�ԍ��E���[���A�h���X���󂯎��A
	 * �t�B�[���h�ɐݒ肷�� �����ɂ�鍀�ڂ̐ݒ�͐e�̃R���X�g���N�^�ōs��
	 * �@��ɁhCAMERA-002�h��ݒ肷��
	 * 
	 * @param contract    �_��Җ�
	 * @param telNum      �d�b�ԍ�
	 * @param mailAddress ���[���A�h���X
	 */
	public CameraSmartphone2(String contract, String telNum, String mailAddress) {
		super(contract, telNum, mailAddress); 		// �e�̃R���X�g���N�^�ďo
		model = "CAMERA-002";
	}

	/**
	 * �J�����B�e���\�b�h
	 * 
	 * @return void
	 */
	public void takePicture() {
		System.out.println("�V���b�^�[���w�p�V�����x�Ɛ؂�܂���");
	}
}