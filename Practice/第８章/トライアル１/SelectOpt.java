
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * �@�\�I�����
 *
 * �u����Ǘ��v�uDVD�Ǘ��v�u�ݏo�v�u�ԋp�v�̊e�@�\��I������B
 * �I������ꍇ�́u�I���v��I������B
 */
public class SelectOpt extends JFrame implements ActionListener {

	private JButton memberButton = new JButton("����Ǘ�");
	private JButton dvdsButton = new JButton("DVD�Ǘ�");
	private JButton rentButton = new JButton("�ݏo");
	private JButton giveBackButton = new JButton("�ԋp");
	private JButton exitButton = new JButton("�I��");

	/**
	 * �R���X�g���N�^
	 *
	 * �@�\�I����ʂ̓��e��ݒ肷��
	 */
	public SelectOpt() {

		super("�@�\�I�����");

		setLocation(300, 300);
		setSize(300, 300);

		Container container = getContentPane();

		GridLayout gridLayout = new GridLayout(3, 2, 5, 5);
		container.setLayout(gridLayout);

		container.add(memberButton);
		container.add(dvdsButton);
		container.add(rentButton);
		container.add(giveBackButton);
		container.add(exitButton);

		// DVD�Ǘ��{�^�����������ۂ̏�����ǉ�
		memberButton.addActionListener(this);

	}

	/**
	 * �{�^�����������ۂ̏���
	 *
	 * ����Ǘ��{�^���������ꂽ�ہA����Ǘ���ʂ�\������B
	 *
	 * @param event �C�x���g���e
	 */
	@Override
	public void actionPerformed(ActionEvent event) {

		// ����Ǘ���ʂ�\������
		Members members = new Members();
		members.setVisible(true);
	}
}
