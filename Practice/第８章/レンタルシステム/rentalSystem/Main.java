package rentalSystem;

import javax.swing.JFrame;

import rentalSystem.view.MenuView;

/**
 * �����^���V�X�e��
 *
 * �N���p�N���X
 */
public class Main {

	/**
	 * ���C�����\�b�h
	 *
	 * �v���O�������N�������ۂɍŏ��ɌĂяo����郁�\�b�h�B
	 *
	 * @param args �N�����Ɏw�肵������
	 */
	public static void main(String[] args) throws Exception {

		MenuView menuView = new MenuView();
		menuView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuView.setVisible(true);
	}
}