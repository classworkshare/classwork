
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * ����Ǘ����
 *
 * ������́u�ꗗ�\���v�u�X�V�v�u�}���v�u�폜�v��I������
 * �I������ꍇ�́u�I���v��I������B
 */
public class Members extends JFrame {

	private JButton listButton = new JButton("�ꗗ�\��");
	private JButton updateButton = new JButton("�X�V");
	private JButton insertButton = new JButton("�}��");
	private JButton deleteButton = new JButton("�폜");
	private JButton exitButton = new JButton("�I��");

	/**
	 * �R���X�g���N�^
	 *
	 * ����Ǘ���ʂ̓��e��ݒ肷��
	 */
	public Members() {

		super("����Ǘ����");

		setLocation(400, 400);
		setSize(300, 300);

		Container container = getContentPane();

		GridLayout gridLayout = new GridLayout(3, 2, 5, 5);
		container.setLayout(gridLayout);

		container.add(listButton);
		container.add(updateButton);
		container.add(insertButton);
		container.add(deleteButton);
		container.add(exitButton);

	}
}
