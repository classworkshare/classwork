package pack1;

import pack2.Game;

/**
 * @author You
 *
 *         �Q�[���t���X�}�[�g�t�H���N���X �@
 */
public class SmartphoneGame1 extends Smartphone implements Game {
	/**
	 * �R���X�g���N�^ �_��Җ��E�d�b�ԍ��E���[���A�h���X���󂯎��A�t�B�[���h�ɐݒ肷�� �����ɂ�鍀�ڂ̐ݒ�͐e�̃R���X�g���N�^�ōs��
	 * �@��ɁhGAME-001�h��ݒ肷��
	 * 
	 * @param contract    �_��Җ�
	 * @param telNum      �d�b�ԍ�
	 * @param mailAddress ���[���A�h���X
	 */
	public SmartphoneGame1(String contract, String telNum, String mailAddress) {
		super(contract, telNum, mailAddress); 		// �e�̃R���X�g���N�^�Ăяo��
		model = "GAME-001";
	}

	/**
	 * �Q�[�����\�b�h
	 * 
	 * @return void
	 */
	public void playGame() {
		System.out.println("���z�����X�^�[�ǐՃQ�[���ŗV�т܂���");
	}
}