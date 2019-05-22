
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * �����^���V�X�e��
 *
 * �V�X�e���̊J�n���
 * �f�[�^�x�[�X�֐ڑ����邽�߂̃��[�U���ƃp�X���[�h����͂���B
 */
public class Rental extends JFrame implements ActionListener {

	/** ���[�U���̃��x�� */
	private JLabel userNameLabel = new JLabel("���[�U���F", JLabel.RIGHT);

	/** ���[�U���̓��͗� */
	private JTextField userNameField = new JTextField();

	/** �p�X���[�h�̃��x�� */
	private JLabel passwordLabel = new JLabel("�p�X���[�h�F", JLabel.RIGHT);

	/** �p�X���[�h�̓��͗� */
	private JPasswordField passwordField = new JPasswordField();

	/** ���̓{�^�� */
	private JButton inputButton = new JButton("����");

	/**
	 * ���C�����\�b�h
	 *
	 * TODO �{���̐������e
	 * �v���O�������N�������ۂɍŏ��ɌĂяo����郁�\�b�h�B
	 *
	 * @param args �N�����Ɏw�肵������
	 */
	public static void main(String[] args) throws Exception {

		// �����^���V�X�e���̊J�n��ʁi���̉�ʁj��\������
		Rental rental = new Rental();
		rental.setDefaultCloseOperation(EXIT_ON_CLOSE);
		rental.setVisible(true);
	}

	/**
	 * �R���X�g���N�^
	 *
	 * �V�X�e���̊J�n��ʂ̓��e��ݒ肵�Ă���B
	 */
	public Rental() {

		// ��ʂ̃^�C�g�����w��
		super("�f�[�^�x�[�X�ڑ�");

		// �\�������ʂ̃T�C�Y�ƈʒu���w��
		setLocation(200, 200);
		setSize(300, 150);

		Container container = getContentPane();

		GridLayout gridLayout = new GridLayout(4, 2);
		container.setLayout(gridLayout);

		// ���[�U���̓��͗�
		container.add(userNameLabel);
		container.add(userNameField);
		// �p�X���[�h�̓��͗�
		container.add(passwordLabel);
		container.add(passwordField);

		// ���̓{�^��
		container.add(inputButton);

		// ���̓{�^�����������ۂ̏�����ݒ�
		inputButton.addActionListener(this);
	}

	/**
	 * �{�^�����������ۂ̏���
	 *
	 * ���̓{�^���������ꂽ�ہA�@�\�I����ʂ�\������B
	 *
	 * @param event �C�x���g���e
	 */
	@Override
	public void actionPerformed(ActionEvent event) {

		// �@�\�I����ʂ�\������
		SelectOpt selectOpt = new SelectOpt();
		selectOpt.setVisible(true);
	}
}
